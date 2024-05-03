package assigment2_part1;

class Assigment2_Part1 {
	public static void main(String arg[]) {
	
	
	
	int n =10;                            // Set N = 10 for the number of digits in my Kean ID
	int id[]= new int [n];               // Make id array an int since its id numbers
	
	id[0]=1;                            // Begin to assign an int for the 10 arrays
	id[1]=1;
	id[2]=1;
	id[3]=1;
	id[4]=9;
	id[5]=8;
	id[6]=2;
	id[7]=5;
	id[8]=6;
	id[9]=8;
	
    int m = 0;                        // Use m as the variable for median
    
    if(n%2==1) {                     // Begin a loop  to solve if the last digit is even or odd
    	m = id[(n+1)/2-1];
    	System.out.println("The median of your kean id is: " + m);         // If Digit is even display the median integer
    }
    else
    {
    	m = (id[n/2-1] + id[n/2])/2;                                     // Set the else to display the mode if the integer is odd
    }
    	System.out.println("The meidan of your kean id is: " + m);         // Display the output results of your id number
    
}

}
