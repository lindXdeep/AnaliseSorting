package Algorithms;

import Sort.ArchetypeSort;

public class InsertionGuarded extends ArchetypeSort{

    public InsertionGuarded(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        
        analyze.start(nameSort);

        int backup = array[0];
        
        array[0] = 0;
        
        int i, j, x;
        
        for (i = 1; i < size; i++) {
            
            analyze.step(2);

            x = array[i];
            for (j = i-1; array[j] > x; j--) {

                analyze.cycle(2);

                array[j+1] = array[j];
            }   
            array[j+1] = x; 
        }

        int p = 1;
        for (; p < size && array[p] < backup; p++){

            analyze.cycle(3);

            array[p-1] = array[p];
        }

        array[p-1] = backup;
        analyze.step();
        analyze.stop();
    }
}