package Algorithms;

import Sort.ArchetypeSort;

public class Heap extends ArchetypeSort{

    public Heap(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

        for (int i = size/2-1; i >= 0; i--) {
            analyze.step();
            
            downHeap(i, size-1);
        }
            
        for (int i = size-1; i >= 0; i--) {
            analyze.step();

            swap(0, i);
            downHeap(0, i-1);
        }
        analyze.stop();
    }

    public void downHeap(int k, int s){
        int root = array[k];
        
        while(k <= s/2){
            analyze.cycle(3);

            int spawned = k*2;
           
            if((spawned < s) && (array[spawned] < array[spawned+1]))
                spawned++;

            if(root >= array[spawned])
                break; 
            //else
                swap(k, spawned);

            k = spawned;    
        }
    } 
}