package Generics;
import java.util.ArrayList;

public class Main {
	 
    public static void main(String[] args) {
        MenuItem<String, Integer> lasagna = new MenuItem<>("Pizza",8 );
        MenuItem<String, Integer> apple = new MenuItem<>("Hot dog",5);
       
       
        ArrayList<Servable> foodList = new ArrayList<>();
        foodList.add(apple);
        foodList.add(lasagna);
        MenuItem.displayAllOrder(foodList);
 
        MenuItem<String, Double> banana = new MenuItem<>("Peach", 1.25);
        MenuItem<String, Double> oatmeal = new MenuItem<>("Cereal", 4.99);
 
        ArrayList<Servable> foodList2 = new ArrayList<>();
        foodList2.add(banana);
        foodList2.add(oatmeal);
        MenuItem.displayAllOrder(foodList2);
 
      
        MenuItem<String, Double> Sushi = new MenuItem<>("California Roll",8.55 );
        MenuItem<String, Double> Soup = new MenuItem<>("Noodle",7.55);
       
       
        ArrayList<Servable> foodList3 = new ArrayList<>();
        foodList3.add(Sushi);
        foodList3.add(Soup);
        MenuItem.displayAllOrder(foodList3);
 
 
 
 
    }
}

