package Sort;

import Algorithms.*;

public class SelectSort{

    private Sorting sorting = null;
    
    private int[] array;
    
    public SelectSort(int [] sourceArray){
        this.array = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            this.array[i] = sourceArray[i];
        }
    }

    //Registered sorting types
    private TypeSort type_Selection = TypeSort.SELECTION;
    private TypeSort type_Insertion = TypeSort.INSERTION;
    private TypeSort type_Bubble = TypeSort.BUBBLE;

    public Sorting getSorting(TypeSort typeSort){
        
        switch(typeSort){
            case SELECTION: sorting = new Selection(this.array, type_Selection.nameSort()); break; 
            case INSERTION: sorting = new Insertion(this.array, type_Insertion.nameSort()); break; 
            case BUBBLE:    sorting =  new Bubble(this.array, type_Bubble.nameSort());  break;
            default:
                break;
        }

        return sorting;
    }
}