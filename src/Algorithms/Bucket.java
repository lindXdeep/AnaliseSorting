package Algorithms;

import Sort.ArchetypeSort;

public class Bucket extends ArchetypeSort{

    public Bucket(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

        int RANGE = this.MAX_VAL - this.MIN_VAL +1;
        int[] bucket =  new int[RANGE];

        for (int i = 0; i < size; i++){
            bucket[ array[i] - this.MIN_VAL ]++;  

            analyze.cycle();
        }
              
        
        int k = 0;
        for (int i = 0; i < RANGE; i++) {
            analyze.step();
            
            int j = 0;
            while (j++ < bucket[i]) {
                array[k++] = i + MIN_VAL;
                analyze.cycle();     
            }   
        }
        
           
        analyze.stop();
    }
}