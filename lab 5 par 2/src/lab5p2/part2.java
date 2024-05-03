package lab5p2;

class BubbleSort {
	  /** Bubble sort method */
	  public static void bubbleSort(int[] list) {
		boolean needNextPass = true;
		
		long startTime = System.nanoTime();
		for (int k = 1; k < list.length && needNextPass; k++) {
	 	
	  	needNextPass = false;
	  	for (int i = 0; i < list.length - k; i++) {
	    	if (list[i] > list[i + 1]) {
	     	
	      	int temp = list[i];
	      	list[i] = list[i + 1];
	      	list[i + 1] = temp;
	      	
	      	needNextPass = true;
	    	}
	  	}
		}
		long endTime = System.nanoTime();
		
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		
		
	  }
	 
	  /** A test method */
	  public static void main(String[] args) {
		     int[] arr = new int[10000];
		     int n = arr.length;

		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++)
	  	System.out.print(arr[i] + " ");
	  }
	}
