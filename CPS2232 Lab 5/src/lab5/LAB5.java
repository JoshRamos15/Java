package lab5;


public class LAB5 {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
    	 long startTime = System.nanoTime();
    	int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
        
        long endTime = System.nanoTime();
        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 1,1,9,8,2,5,6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
}

