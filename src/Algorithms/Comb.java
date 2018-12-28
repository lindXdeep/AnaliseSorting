package Algorithms;

import Sort.ArchetypeSort;

public class Comb extends  ArchetypeSort{

    public Comb(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

        int gap = size;

        boolean swapped =  true;

        while (gap > 1 || swapped == true) {

            analyze.step(2);

            if (gap > 1) 
                gap = (int) (gap/1.27);
            
            swapped = false;

            for (int i = 0; i + gap < size; i++) {

                analyze.cycle();

                if (array[i] > array[i + gap]) {
                    swap(i,  i + gap);
                    swapped = true;
                }
            }
        }
        analyze.stop();
    }
}