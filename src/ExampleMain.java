import Analyze.*;
import Sort.*;

class ExampleMain{
    
    private static ArrayHandle arrayHandle = ArrayHandle.getInstance();
    
    private static int[] array = arrayHandle.getRandomIntArray(100000);
    
    public void initializing(){
        //System.out.print("Source array: ");
        //arrayHandle.printArray(array);
    }

    public void sortingAlgorithms(){

        SelectSort sortSelect = new SelectSort(array);

        Sorting selection = sortSelect.getSorting(TypeSort.SELECTION);
        Thread selection_thread = new Thread(selection); 
                selection_thread.start();      
        
        Sorting insertion = sortSelect.getSorting(TypeSort.INSERTION);
        Thread insertion_thread = new Thread(insertion); 
                insertion_thread.start();     
        
        Sorting bubble = sortSelect.getSorting(TypeSort.BUBBLE);
        Thread bubble_thread =  new Thread(bubble);
                bubble_thread.start();

        Sorting bubbleTwoForcked = sortSelect.getSorting(TypeSort.BUBBLETWOFORCKED);
        Thread bubbleTwoForcked_thread =  new Thread(bubbleTwoForcked);
                bubbleTwoForcked_thread.start();

        try {
            selection_thread.join();
            insertion_thread.join(); 
            bubble_thread.join(); 
            bubbleTwoForcked_thread.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
                
        arrayHandle.checkSequence(selection);
        arrayHandle.checkSequence(insertion);
        arrayHandle.checkSequence(bubble);
        arrayHandle.checkSequence(bubbleTwoForcked);
        // arrayHandle.printArray(selection.getResultsArrray());
        // arrayHandle.printArray(selection);
        // arrayHandle.printArray(insertion);
        // arrayHandle.printArray(bubble);
        // arrayHandle.printArray(bubbleTwoForcked);
       
        ResultsAnalyze.getInstance().viewResults();
    }

    public static void main(String[] args) {
        
        Thread mainThread =  new Thread(new Runnable(){
            @Override
            public void run() {
                ExampleMain basicAlgorithms = new ExampleMain();
                            basicAlgorithms.initializing();
                            basicAlgorithms.sortingAlgorithms();
            }
        });

        mainThread.setName("Main");
        mainThread.start();
        System.out.println("Thread: " + mainThread.getName() + " started . . .");
    }
}