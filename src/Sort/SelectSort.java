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
    private TypeSort type_Bubble_optim = TypeSort.BUBBLEOPTIM;
    private TypeSort type_BubbleTwoForcked = TypeSort.BUBBLETWOFORCKED;
    private TypeSort type_BubbleShaker = TypeSort.BUBBLESHAKER;
    private TypeSort type_BubbleEvenOdd = TypeSort.BUBBLEEVENODD;
    private TypeSort type_Comb = TypeSort.COMB;
    private TypeSort type_Shell = TypeSort.SHELL;
    private TypeSort type_Shell_sedgewick =  TypeSort.SHELL_SEDGEWICK;
    private TypeSort type_InsertionGuarded = TypeSort.INSERTIONGUARDED;
    private TypeSort type_Quick = TypeSort.QUICK;
    private TypeSort type_Merge = TypeSort.MERGE;
    private TypeSort type_Heap = TypeSort.HEAP;

    

    public Sorting getSorting(TypeSort typeSort){
        
        switch(typeSort){
            case SELECTION: sorting = new Selection(this.array, type_Selection.nameSort()); 
                break; 
            case INSERTION: sorting = new Insertion(this.array, type_Insertion.nameSort()); 
                break; 
            case BUBBLE:    sorting =  new Bubble(this.array, type_Bubble.nameSort());  
                break;
            case BUBBLEOPTIM: sorting =  new BubbleOptim(this.array, type_Bubble_optim.nameSort());  
                break;
            case BUBBLETWOFORCKED: sorting = new BubbleTwoForcked(this.array, type_BubbleTwoForcked.nameSort()); 
                break;
            case BUBBLESHAKER: sorting = new BubbleShaker(this.array, type_BubbleShaker.nameSort()); 
                break;
            case BUBBLEEVENODD: sorting = new BubbleEvenOdd(this.array, type_BubbleEvenOdd.nameSort()); 
                break; 
            case COMB: sorting = new Comb(this.array, type_Comb.nameSort()); 
                break;        
            case SHELL: sorting = new Shell(this.array, type_Shell.nameSort());
                break;
            case SHELL_SEDGEWICK: sorting = new Shell_Sedgewick(this.array, type_Shell_sedgewick.nameSort());
                break;
            case INSERTIONGUARDED: sorting = new InsertionGuarded(this.array, type_InsertionGuarded.nameSort());
                break;
            case QUICK: sorting = new Quick(this.array, type_Quick.nameSort());
                break;
            case MERGE: sorting = new Merge(this.array, type_Merge.nameSort());
                break;
            case HEAP: sorting = new Heap(this.array, type_Heap.nameSort());
                break;    
            default:
                break;
        }

        return sorting;
    }
}