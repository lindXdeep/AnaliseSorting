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
    private TypeSort type_shell = TypeSort.SHELL;
    private TypeSort type_shell_sedgewick =  TypeSort.SHELL_SEDGEWICK;
    private TypeSort type_insertionGuarded = TypeSort.INSERTIONGUARDED;
    private TypeSort type_quick = TypeSort.QUICK;
    

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
            case SHELL: sorting = new Shell(this.array, type_shell.nameSort());
                break;
            case SHELL_SEDGEWICK: sorting = new Shell_Sedgewick(this.array, type_shell_sedgewick.nameSort());
                break;
            case INSERTIONGUARDED: sorting = new InsertionGuarded(this.array, type_insertionGuarded.nameSort());
                break;
            case QUICK: sorting = new Quick(this.array, type_quick.nameSort());
                break;
            default:
                break;
        }

        return sorting;
    }
}