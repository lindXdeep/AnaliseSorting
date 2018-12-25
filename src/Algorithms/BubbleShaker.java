package Algorithms;

import Sort.ArchetypeSort;

public class BubbleShaker extends ArchetypeSort{

    public BubbleShaker(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

        for (int i = 0; i <size/2; i++) {

            analyze.step();

            boolean swapped = false;
            for (int j = i; j < size-i-1; j++) {

                analyze.cycle();

                if(array[j] > array[j+1]){
                    swap(j, j+1);
                    swapped = true;
                }
                    
            }
            for (int j = size-2-i; j > i; j--) {

                analyze.cycle();

                if (array[j] < array[j-1]){
                    swap(j-1, j);
                    swapped = true;
                } 
                    
            }
            if(!swapped)
                break;
        }


        analyze.stop();
    }
} 