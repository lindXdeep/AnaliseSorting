package Sort;
import Analyze.*;

public abstract class ArchetypeSort implements Sorting{

    public String nameSort;
    protected int[] mainArray;
    protected int size;
    protected Analyze analyze;   
    
    public ArchetypeSort(int[] sourceArray, String nameSort){
        this.analyze = new Analyze();
        this.size = sourceArray.length;
        this.nameSort = new String(new StringBuilder(nameSort));
        
        this.mainArray = new int[this.size];
        for (int i = 0; i < this.size; i++) 
           this.mainArray[i] = sourceArray[i];
    }

    public void swap(int a, int b){
        analyze.compare();
        int temp = mainArray[a];
        mainArray[a] = mainArray[b];
        mainArray[b] = temp;
    }
    
    @Override
    public int[] getResultsArrray(){
        return this.mainArray;
    }

    @Override
    public String getName() {
        return this.nameSort;
    }

    

}