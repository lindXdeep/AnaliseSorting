package Algorithms;

import Sort.ArchetypeSort;

public class Insertion extends ArchetypeSort{

    public Insertion(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        
        analyze.start(nameSort);

        int i,j,x = 0;

            for (i = 0; i < size; i++) {                    
                analyze.step();

                x = array[i];

                for(j = i-1; j >= 0 && array[j] > x; j--){
                    
                    array[j+1] = array[j]; 

                    analyze.cycle();   
                }

                array[j+1] = x;
                
                analyze.step();
            }

        analyze.stop();    
    }
}