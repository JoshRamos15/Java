package lab1;

interface Edible {
	abstract String howToEat();
	default String howToCook(){
		return "Boil";
	}
}
class Sushi implements Edible {
	private String Name ;
	private String Flavor;
	private int Rating;
	
	public Sushi(String Name, String Flavor, int Rating) {
		this.Name = Name;
		this.Flavor = Flavor;
		this.Rating = Rating;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getFlavor() {
		return Flavor;
	}

	public void setFlavor(String Flavor) {
		this.Flavor = Flavor;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int Rating) {
		this.Rating = Rating;
	}

	@Override
	public String howToEat() {
		return "Pick  up  sushi  with  chopsticks";
	}
	
	@Override
	public String toString(){
		return Name            +      "             "          + Flavor +         "             "   + Rating;
	}
}
/* Soup Class*/
class Soup implements Edible {
	private String name;
	private String flavor;
	private int rating;
	
	public Soup(String name, String flavor, int rating) {
		this.name = name;
		this.flavor = flavor;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getflavor() {
		return flavor;
	}

	public void setflavor(String flavor) {
		this.flavor = flavor;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String howToEat() {
		return "Use spoon to pick up soup";
	}
	
	@Override
	public String toString(){
		return name + "               "  + flavor  + "               " +   rating;
		
	}
}
public class EdibleLab{
	public static void main(String[] args) {
		Edible[] edibles = new Edible[4];
		edibles[0] = new Sushi("California Roll","Crab",10);
		edibles[1] = new Sushi("Tuna Roll ","         Tuna" ,10);
		edibles[2] = new Soup("Noodle Soup","Noodles",10);
		edibles[3] = new Soup("Chicken Soup","Chicken",10);
		 System.out.println("-----------------------------------------------------------------------------");
	        System.out.printf("%15s %15s %15s ", " Name ", "Flavor", "Rating" );
	        System.out.println();
	        System.out.println("-----------------------------------------------------------------------------");
	       
		for(Edible e: edibles){
			System.out.println();
		    System.out.println(e);
		    System.out.println();
	        
			System.out.println(e.howToEat());
			System.out.println();
			
			 System.out.println(e.howToCook());
			 System.out.println();
			
			
			
		}
	}
}