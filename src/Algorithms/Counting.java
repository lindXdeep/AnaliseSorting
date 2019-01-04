package Algorithms;

import Sort.ArchetypeSort;

public class Counting extends ArchetypeSort{

    public Counting(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
        analyze.start(nameSort);

            int MIN = 0, MAX = 0, RANGE = 0;
            for (int i = 0; i < array.length; i++) {
                
                analyze.step(2);
                
                if(array[i] < MIN)
                    MIN = array[i];
                if(array[i] > MAX)
                    MAX = array[i];
            }
            RANGE = MAX-MIN+1;

            int[] count = new int[RANGE];

            for (int i = 0; i < array.length; i++){
                count[ array[i]-MIN ]++;

                analyze.cycle();
            }
                            
            for (int i = 1; i < RANGE; i++){
                count[i] += count[i-1];

                analyze.cycle();
            } 
            
            int j = 0;
            for (int i = 0; i < RANGE; i++) {
                analyze.step();

                while (j < count[i]) {
                    array[j++] = i + MIN; 
                    
                    analyze.cycle();
                }
            }
            
        analyze.stop();
    }
}

