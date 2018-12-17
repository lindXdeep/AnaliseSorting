package Algorithms;

import Sort.ArchetypeSort;

public class BubbleTwoForcked extends ArchetypeSort{

    public BubbleTwoForcked(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
                
        int leftIdx = 0;
        int rightIdx = size-1;
        int temp_redirect = 0;

        analyze.start(nameSort);

        do {

            for (int i = 1; i <= rightIdx; i++) {
                
                analyze.cycle(2);
                
                if(array[i-1] > array[i])
                    swap(i-1, i);
                temp_redirect = i;
            }

            rightIdx = temp_redirect - 1;
            
            for(int j = rightIdx; j >= leftIdx; j--){
                
                analyze.cycle(2);

                if(array[j] > array[j+1])
                    swap(j, j+1);
                temp_redirect = j;
            }

            leftIdx = temp_redirect + 1;

            analyze.step(2);

        } while (leftIdx < rightIdx);

        analyze.stop();
    }
}