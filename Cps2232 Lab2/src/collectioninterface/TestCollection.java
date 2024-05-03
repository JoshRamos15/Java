package collectioninterface;

import java.util.*;

public class TestCollection {
  public static void main(String[] args) {
	  HashSet<String> h1 = new HashSet<String>();
 
    h1.add("New York");
    h1.add("Atlanta");
    h1.add("Dallas");
    h1.add("Denver");// Added
    h1.add("Califronia");//Added
    

    System.out.println("A list of cities in collection1:");
    System.out.println(h1);

    System.out.println("\nIs Dallas in collection1? "
      + h1.contains("Dallas"));

    h1.remove("Dallas");
    System.out.println("\n" + h1.size() + 
       " cities are in collection1 now");

 
    HashSet<String> h2 = new HashSet<String>();
    
    h2.add("Seattle");
    h2.add("Portland");
    h2.add("Los Angeles");//Added
    h2.add("Atlanta");//Added
    h2.add("Las Vegas");//Added

    System.out.println("\nA list of cities in collection2:");
    System.out.println(h2);

    HashSet<String> c1 = (HashSet<String>)(h1.clone());
    c1.addAll(h2); // Add all elements in collection2 to c1
    System.out.println("\nCities in collection1 or collection2: ");
    System.out.println(c1);

    c1 = (HashSet<String>)(h1.clone());
    c1.retainAll(h2);
    System.out.print("\nCities in collection1 and collection2: ");
    System.out.println(c1);

    c1 = (HashSet<String>)(h1.clone());
    c1.removeAll(h2);
    System.out.print("\nCities in collection1, but not in 2: ");
    System.out.println(c1);
  }
}