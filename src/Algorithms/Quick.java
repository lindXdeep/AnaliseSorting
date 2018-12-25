package Algorithms;

import Sort.ArchetypeSort;

public class Quick extends ArchetypeSort{
    
    public Quick(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }
       
    @Override
    public void run() {
        analyze.start(this.nameSort);
            
        final int STACKMAX = 2048;
        int[] leftStackArr = new int[STACKMAX]; 
        int[] rightStackArr = new int[STACKMAX];

        int stackPos = 1;
        leftStackArr[stackPos] = 0;
        rightStackArr[stackPos] = array.length-1;

        int left, right, middle;
        int l, r, p;

        do {
            analyze.step();

            left = leftStackArr[stackPos];
            right = rightStackArr[stackPos];
            stackPos--;

            do {
                analyze.step();
                
                middle = (left + right)/2;

                l = left;
                r = right;
                p = array[middle];

                do {
                    analyze.cycle();

                    while(array[l] < p){
                        analyze.cycle();
                        l++;
                    } 
                    while(array[r] > p){
                        analyze.cycle();
                        r--;
                    } 
                    if(l <= r)
                        swap(l++, r--);
                } while (l <= r);

                if(l < middle){
                    if (l < right) {
                        stackPos++;
                        leftStackArr[stackPos] = l;
                        rightStackArr[stackPos] = right;
                    }
                    right = r;
                }else{
                    if(r > left){
                        stackPos++;
                        leftStackArr[stackPos] = left;
                        rightStackArr[stackPos] = r;
                    }
                    left = l;
                }
            } while (left < right);
        } while (stackPos != 0);

        analyze.stop();
    }

    
}