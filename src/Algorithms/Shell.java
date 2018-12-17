package Algorithms;

import Sort.ArchetypeSort;

public class Shell extends ArchetypeSort{

    public Shell(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        
        analyze.start(nameSort);

        int d = size/2; 
        
        while (d>0) {
            
            analyze.step();
            
            for (int j = 0; j < size-d; j++) {

                analyze.cycle(2);

               if(array[j] > array[j+d])
                    swap(j, j+d);
            }
            
            analyze.step();

            d = d/2;
            
            if(d == 1)
                break;
        }    
         
        

        int j,i,x;
        for (i = d; i < size; i++) {
            
            analyze.step(2);
            
            x = array[i];
            for (j = i-d; j >= 0 && array[j] > x; j-=d) {
                
                analyze.cycle(3);

                array[j+d] = array[j];    
            }    
            array[j+d] = x;
            
            analyze.step();
        }
    
        analyze.stop();
    }
}