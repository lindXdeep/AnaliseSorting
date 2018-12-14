import Analyze.*;
import Sort.*;

class ExampleMain{
    
    private static int[] array = {1,9,2,9,3,88,4,7,5,6}; 
    
    public void initializing(){
        System.out.print("Source: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }

    public void sortingAlgorithms(){

        Sorting sort = new TestSort(array, "TestingSortinglnked");
        Thread sort_thread = new Thread(sort); 
               sort_thread.start();      
        
        Sorting sort2 = new TestSort2(array, "TestSort2");
        Thread sort_thread2 = new Thread(sort2); 
               sort_thread2.start();     
        
        try {
            sort_thread.join();
            sort_thread2.join();  
        } catch (InterruptedException e) {
            e.getMessage();
        }

        
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
        System.out.println("Thread: " + mainThread.getName());
    }
}