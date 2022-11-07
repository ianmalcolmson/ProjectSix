package six;

public class SlowSortingAlgorithm {
	
	    void bubbleSort(int arr[])	{
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	    }
	 
	    void printArray(int arr[])	{
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	    
	    
	    void sort(int arr[])	{
	        int n = arr.length;
	 
	        for (int i = 0; i < n-1; i++)	{
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            		int temp = arr[min_idx];
	            		arr[min_idx] = arr[i];
	            		arr[i] = temp;
	        	}
	    }
	 
	   
	    void printArrayTwo(int arr[])	{
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    
	    
	    
	    void sortTwo(int arr[])	{
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	 
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	 
	    
	    static void printArrayThree(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }
	    
	    
	   
	    static void printArrayFour(int arr[])	{
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    int sortThree(int arr[]) {
	        int n = arr.length;
	 
	        for (int gap = n/2; gap > 0; gap /= 2) {
	            
	            for (int i = gap; i < n; i += 1)  {
	                int temp = arr[i];
	                int j;
	                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
	                    arr[j] = arr[j - gap];
	 
	                arr[j] = temp;
	            }
	        }
	        return 0;
	    }
	    
	    
	 
	   
	 
	    
	    public static void main(String args[])	{
	    	SlowSortingAlgorithm  ob = new SlowSortingAlgorithm ();
	        int arr[] = {64,25,12,22,11};
	        ob.sort(arr);
	        System.out.println("Bubble Sort");
	        ob.printArray(arr);
	        
	        SlowSortingAlgorithm obTwo = new SlowSortingAlgorithm();
	        int arrTwo[] = { 64, 34, 25, 12, 22, 11, 90 };
	        ob.bubbleSort(arrTwo);
	        System.out.println("Selection Sort");
	        obTwo.printArray(arrTwo);
	        
	        int arrThree[] = { 12, 11, 13, 5, 6 };
	        SlowSortingAlgorithm obThree = new SlowSortingAlgorithm();
	        obThree.sort(arrThree);
	        System.out.println("Insertion Sort");
	        obThree.printArray(arrThree);  
	        
	        int arrFour[] = {12, 34, 54, 2, 3};
	        SlowSortingAlgorithm obFour = new SlowSortingAlgorithm();
	        obFour.sort(arrFour);
	        System.out.println("Shell Sort");
	        obFour.printArray(arrFour);
	    }
	    
}


