package Sort;
import Analyze.*;

public abstract class ArchetypeSort implements Sorting{

    public String nameSort;
    protected int[] array;
    protected int size;
    protected int MIN_VAL;
    protected int MAX_VAL;
    protected Analyze analyze;   
    
    public ArchetypeSort(int[] sourceArray, String nameSort){
        
        this.analyze = new Analyze();
        
        this.nameSort = new String(new StringBuilder(nameSort));
        this.size = sourceArray.length;
        this.array = new int[this.size];
              
        for (int i = 0; i < this.size; i++) {
            if(sourceArray[i] < this.MIN_VAL)
                this.MIN_VAL = sourceArray[i];
            if(sourceArray[i] > this.MAX_VAL)  
                this.MAX_VAL = sourceArray[i]; 
            this.array[i] = sourceArray[i];

            analyze.cycle(2);
        }
                
        if(sourceArray == null || sourceArray.length == 0 || MIN_VAL == MAX_VAL )
            return;
        
        
        
        
           
    }

    public void swap(int a, int b){
        analyze.compare(3);
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
    @Override
    public int[] getResultsArrray(){
        return this.array;
    }

    @Override
    public int[] getResultsArrray(int size){
        
        int cutArray[] =  new int[size+1];
        for (int i = 0; i < size+1; i++)
            cutArray[i] = array[i];
        return cutArray;
    }

    @Override
    public String getName() {
        return this.nameSort;
    }
}