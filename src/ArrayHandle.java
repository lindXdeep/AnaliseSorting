import java.util.Random;

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
}