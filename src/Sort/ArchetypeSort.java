package Sort;
import Analyze.*;

public abstract class ArchetypeSort implements Sorting{

    public String nameSort;
    protected int[] array;
    protected int size;
    protected Analyze analyze;   
    
    public ArchetypeSort(int[] sourceArray, String nameSort){
        this.analyze = new Analyze();
        this.size = sourceArray.length;
        this.nameSort = new String(new StringBuilder(nameSort));
        
        this.array = new int[this.size];
        for (int i = 0; i < this.size; i++) 
           this.array[i] = sourceArray[i];
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
    public String getName() {
        return this.nameSort;
    }

    

}