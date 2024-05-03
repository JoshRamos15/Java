package array_2d;
import java.util.*;
public class Array_2d {

	    public static void main(String[] args) {              // Start Main Method
	        int[][] smallest = {                              // Created the array smallest and gave integer values 
	                {1, 2, 3},
	                {4, 5, 6, 7, 8},
	                {9, 10, 11, 12},
	                {13, 14, 15, 16, 17, -50}
	        };
	     
	        System.out.println(find_min(smallest));                 // Print output from the find_min method
	    }


	  

	    public static int find_min(int[][] numbers) {             // Start the find_min method from powerpoint
	        int minValue = numbers[3][4];                         //  Set minValue as an int and set column length to 3 and row to 4
	        for (int j = 0; j < numbers.length; j++) {            //  for loop for variable j to begin the test to find smallest number 
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] < minValue ) {             // Second  for loop for variable i to find smallest number
	                    minValue = numbers[j][i];
	                }
	            }
	        }
			return minValue;                                   // Return the smallest number in array
	    }
}
	