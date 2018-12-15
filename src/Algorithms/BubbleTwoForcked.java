package Algorithms;

import Sort.ArchetypeSort;

public class BubbleTwoForcked extends ArchetypeSort{

    public BubbleTwoForcked(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);
        
        int i = 0;
        while(i++ < size)
        {
            if(array[i] > array[i+1])
                swap(i, i+1);

        }


        analyze.stop();
    }
}