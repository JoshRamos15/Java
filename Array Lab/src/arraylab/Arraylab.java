package arraylab;

public class Arraylab {

		  public static  void main(String[] args) {             // Define  main method
		    int[] array = new int[5];                           // Created the array

	

		    double max = array[0];                            
		    int indexOfMax = 0;                               // Declared IndexOfMax
		    for (int i = 1; i < array.length; i++) {          // Use for loop to find the smallest index
		       if (array[i] > max) { 
		        max = array[i];                            
		        indexOfMax = i; 
		      } 
		    } 

		    System.out.println(max+" @ "+ indexOfMax);       // Print the smallest index of element
		  }
	}

		  
		

