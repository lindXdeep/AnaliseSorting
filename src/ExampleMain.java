import Analyze.ResultsAnalyze;
import Sort.*;

class ExampleMain{
    
    private static ArrayHandle arrayHandle = ArrayHandle.getInstance();
    
    private static int[] array = arrayHandle.getRandomIntArray(100);
    
    public void initializing(){
        System.out.print("Source: ");
        arrayHandle.printArray(array);
    }

    public void sortingAlgorithms(){

        SelectSort selectSort = new SelectSort(array);

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