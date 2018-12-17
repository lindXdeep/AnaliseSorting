package Algorithms;

import Sort.ArchetypeSort;

public class Selection extends ArchetypeSort {

    public Selection(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        
        analyze.start(nameSort);

        for (int i = 0; i < size; i++) {
            
            analyze.step();

            for (int j = i+1; j < size; j++) {
                
                analyze.cycle(2);
              
                if(array[i] > array[j])
                     swap(i, j);
            }
        }

        analyze.stop();
    } 
}
