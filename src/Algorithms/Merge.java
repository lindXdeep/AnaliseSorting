package Algorithms;

import Sort.ArchetypeSort;

public class Merge extends ArchetypeSort{

    public Merge(int[] sourceArray, String nameSort){
        super(sourceArray, nameSort);
    }

    @Override
    public void run() {
      
        analyze.start(nameSort);

        mergeSorting(0, array.length-1);

        analyze.stop();
    }

    public void mergeSorting(int left, int right){
        int split;

        if(left < right){

            analyze.step();
      
            split =  (left + right)/2;

            mergeSorting(left, split);
            mergeSorting(split+1, right);
            merge(left, split, right);
        }
    }

    public void merge(int left, int split, int right){
     
        analyze.step();

        int l = left;
        int r = split+1;
        int t = 0;

        int[] temp = new int[left+right+1];

        while(l <= split && r <= right){
            if(array[l] < array[r]){
                
                analyze.cycle();

                array[t++] = array[l++];
            }
                
            else{

                analyze.cycle();   

                array[t++] =  array[r++];
            }
                
        }

        while( r <= right){

            analyze.cycle();    

            array[t++] = array[r++];
        }
            
        while(r <= split){

            analyze.cycle();  
            
            array[t++] = array[l++];
        }
            
        
        for (t = 0; t < right-left+1; t++){

            analyze.cycle();  

            array[left+t] = temp[t];
        }
    }
}