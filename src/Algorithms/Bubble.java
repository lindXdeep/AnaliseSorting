package Algorithms;

import Sort.ArchetypeSort;

public class Bubble extends ArchetypeSort{

    public Bubble(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {

        analyze.start(nameSort);

        for (int i = 0; i < size; i++) {

            analyze.step();

            for (int j = 0; j < size-1-i; j++) {

                analyze.cycle();

                if(array[j] > array[j+1])
                    swap(j, j+1);
            }
        }
        
        analyze.stop();
    }
}