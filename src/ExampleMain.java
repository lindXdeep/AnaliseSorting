import Analyze.ResultsAnalyze;
import Sort.*;

class ExampleMain{
    
    private static int[] array = {1,9,2,9,3,88,4,7,5,6}; 
    
    private static SelectSort selectSort = null;

    public void initializing(){
        System.out.print("Source: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
        selectSort = new SelectSort(array);
    }

    public void sortingAlgorithms(){

        Sorting selection = selectSort.getSorting(TypeSort.SELECTION);
        Thread selection_thread = new Thread(selection); 
                selection_thread.start();      
        
        Sorting insertion = selectSort.getSorting(TypeSort.INSERTION);
        Thread insertion_thread = new Thread(insertion); 
                insertion_thread.start();     
        
        try {
            selection_thread.join();
            insertion_thread.join();  
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