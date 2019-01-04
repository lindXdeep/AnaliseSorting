import java.util.Random;
import Sort.Sorting;

public class ArrayHandle{
    
    private static ArrayHandle Instance = null;
    
    private ArrayHandle(){}

    public static ArrayHandle getInstance(){
       if(Instance == null){
           Instance = new ArrayHandle();
       }
       return Instance;
    }

    public int[] getRandomIntArray(int n){
        Random rand = new Random();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = rand.nextInt(n+1);
		return arr;
    }

    public void printArray(int[] array) {
        int newStrCount = 0;
		int size = array.length;
				
		int sizeDeli = size;
		int countDeli = -2;
					
		String[] delimiter = {"%2d ","%3d ","%4d ","%5d ","%6d ","%7d ","%8d ","%9d ","%10d ","%11d "};
				
        while(sizeDeli != 0){
            sizeDeli = sizeDeli/10;
            countDeli++;
            if(countDeli < 0)
                countDeli = 0;
        }
        
        System.out.println();
        for (int i = 0; i < size; i++)
        {
            System.out.printf(delimiter[countDeli], array[i]);
                        
            newStrCount ++;
            if( (size <= 100 && newStrCount  == 19) || (size > 100 && size <= 1000 && newStrCount == 16) || (size > 1000 && newStrCount == 10)) {
                System.out.println();
                newStrCount=0;
            } 
        } 
    }
    
    public void printArray(Sorting obj) {
		System.out.print("\nResult: [" + obj.getName() + "]: \t");
		printArray(obj.getResultsArrray());
    }

    public void printArray(Sorting obj, int to_notValid){
        System.out.print("\nError: [" + obj.getName() + "]: \t"); 
        printArray(obj.getResultsArrray(to_notValid));
        System.out.print(". . .\n"); 
    }
    
    public void checkSequence(Sorting obj) {                //View sorting or not sorting without array
        int arr[] = obj.getResultsArrray();
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1] ) {
                System.err.print("\nResult: " + obj.getName() + " -> sorted false");
                System.err.println( (i-2) + " [" + (i-1) + "] > [" + (i) + "] " + (i+1) + " " + (i+2));
                return;
            }
        }
        System.out.print("\nResult: " + obj.getName() + " -> sorted true");
    }

    public void checkSequence(Sorting obj, boolean value) {     //View sorted or not, with print array antil to falure 
       
        int count_to_falure = 1;

        int arr[] = obj.getResultsArrray();
         
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1] ) {
                    System.err.print("\nResult: " + obj.getName() + " -> sorted false");
                    if (value && count_to_falure <= 100 ){
                        printArray(obj, count_to_falure);
                    }
                    return;
                }
                count_to_falure++;
            }
        System.out.print("\nResult: " + obj.getName() + " -> sorted true");
    }
}

// Old format
// public void checkSequence(Sorting obj) {
//     System.out.print("\nResult: " + obj.getName() + " -> sorted ");
    
//     int arr[] = obj.getResultsArrray();
    
//     for (int i = 0; i < arr.length-1; i++) {
//         if(arr[i] > arr[i+1] ) {
//             System.err.print("\tfalse");
//             return;
//         }
//     }
//     System.out.println("true");
// }