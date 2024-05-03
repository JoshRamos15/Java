package lab2_1;

public class RandomInteger {

	public static void main(String[] args) {
		
	int dec = 721;     // Declaring a decimal value as an integer
	
		
		System.out.println((int)(Math.random()*100));         // Random Number between 0 and 100
		System.out.println(50 +(int)( Math.random()*50));   // Random Number between 50 and 99
		System.out.println(Integer.toHexString(dec));     // Decimal to Hexadecimal

	}

}
