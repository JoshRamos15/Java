package rectangle;

public class Rectangle {
	private static double Height; // Initalize Height and Width as private
	private static double Width; 
	 
 public static void setWidth(double newWidth) {
	 Width = newWidth;                            // Setting Width to newWidth as a double
 }
 public static void setHeight(double newHeight) {
	 Height = newHeight;                           // Setting Height to newHeight as a double
 }
 public static double GetArea() {                  
	 return  Width * Height;	                   // Having GetArea method  return the formula Width * Height
 }
 public static double GetPerim() {
	 return 2 * (Width + Height);                  // Having GetPerimeter method return the formula 2 * (Width + Height)
 }
 public static void Display() {
	 System.out.println("The Width of this rectangle is : " + Width);       //Display the width of the rectangle 
	 System.out.println("The Height of this rectangle is : " + Height);     // Display the height of the rectangle
	 System.out.println("The area of this rectangle is  : " + GetArea());   // Display the area of the rectangle 
	 System.out.println("The perimeter of this rectangle is  : " + GetPerim() ); // Display the perimeter of the rectangle
 }
 public static void main(String[] args) {               // Creating the 2 test rectangle objects
	 Rectangle R1 = new Rectangle();
	 System.out.println("The rectangle 1:");
	 R1.setHeight(40);                                 //Set height to 40
	 R1.setWidth(4);                                  //set width to 4
	 R1.GetArea();                                   // recall the area formula from getArea method
	 R1.GetPerim();                             //recall the perimeter formula from GetPerim method
	 R1.Display();                                 // Display the results from the display method 
	 
	 Rectangle R2 = new Rectangle();
	 System.out.println(" The rectangle 2: ");
	 R2.setHeight(39.5);                          // Set Hieght to 39.5
	 R2.setWidth(3.5);                            // Set width to 3.5
	 R2.GetArea();                               //recall the area formula from getArea method
	 R2.GetPerim();                              //recall perimeter formula from getPerim method
	 R2.Display();                              // Display the results from recalling the Display method
	 
 }
	}


