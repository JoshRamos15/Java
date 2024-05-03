package lab2_2;

import java.util.*;
public class GCD {

	public static void main(String[] args) {                     // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 positive integers: ");        // Getting 2 numbers from a user
		int num1 = sc.nextInt();                        // Declaring a variables and scanning input as an integer
		int num2 = sc.nextInt();
		
		while(num1 != num2)                            //Running while loop until num1 == num2
		{
			 if(num1 > num2)                           //Checking if num1 is greater than num1 = num1 - num2
				 num1 = num1- num2;
			 else
				 num2 = num2 - num1;
		}
		System.out.println("GCD is: "+num1);
		}

	}


