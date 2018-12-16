package Algorithms;

import Sort.ArchetypeSort;

public class Shell_Sedgewick extends ArchetypeSort{

    public Shell_Sedgewick(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

        int d = size;

        while(d > 0){
            
            analyze.step();

            d = d/2; 
            
            for (int i = 0; i < size-d; i++) {
                
                analyze.cycle();
                
                if(array[i] > array[i+d])
                    swap(i, i+d);
            }

            d = size/2;
            int x = 0;
            int j = 0;

            while (d > 0) {

                analyze.step();

                for (int i = d; i < size; i++) {

                    analyze.step();

                    x = array[i];
                    for(j = i-d; j>=0 && array[j] > x; j-=d ){
                        
                        analyze.cycle();

                        array[j+d] = array[j];
                    }
                    array[j+d] = x;

                    analyze.step();
                }
                d = d/2;
            }
        }

        analyze.stop();
    }
}