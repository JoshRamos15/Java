package recursive;

public class RecursiveBinarySearch {
	  public static int binarySearch(int[] list, int key) {
	    int low = 0;
	    int high = list.length - 1;
	    return binarySearch(list, key, low, high);
	  }

	  private static int binarySearch(int[] list, int key,
	      int low, int high) {
	    if (low > high)  // The list has been exhausted without a match
	      return -low - 1;

	    int mid = (low + high) / 2;
	    if (key < list[mid])
	      return binarySearch(list, key, low, mid - 1);
	    else if (key == list[mid])
	      return mid;
	    else
	      return binarySearch(list, key, mid + 1, high);
	  }
	  
	  public static void main(String[] args) {
			 int[] list = {3, 5, 7, 8, 10, 17, 24, 29,100,1000};
			    System.out.println(binarySearch(list, 10));
			  
		  long begin, end, time;
		  // we will measure time it took to search
		  begin = System.nanoTime();
		  //we measure in nanoseconds.
		  //Starting the watch
		 
		  end = System.nanoTime();
		  time = end-begin; 
		  System.out.println("it took " + time + " nanoseconds to run binary search with the key " +   " on the array of " +   " elements.");}

		
	  }
	







