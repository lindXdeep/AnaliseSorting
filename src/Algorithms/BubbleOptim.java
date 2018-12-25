package Algorithms;

import Sort.ArchetypeSort;

public class BubbleOptim extends ArchetypeSort  {

    public BubbleOptim(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);
        
        for (int i = 0; i < size-1; i++) {
            analyze.step();

            boolean swapped =  false;

            for (int j = 0; j < size-i-1; j++) {
                
                analyze.cycle();

                if (array[j] > array[j+1]) {
                    swap(j, j+1);
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        analyze.stop();
    }
}