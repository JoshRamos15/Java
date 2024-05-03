package Generics;

import java.util.ArrayList;

public class MenuItem<F, P> implements Servable<F, P> {
 
    private F food;
 
    private P price;
 
    MenuItem() {
    }
 
    MenuItem(F food, P price) {
        this.food = food;
        this.price = price;
    }
 
 
    public static void displayAllOrder(ArrayList<Servable> menulist) {
        for (int i = 0; i < menulist.size(); i++) {
            System.out.println(menulist.get(i));
        }
    }
 
    @Override
    public F whatToServe() {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public void printPrice() {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void displayItem(Servable s) {
        // TODO Auto-generated method stub
 
    }
 
    public P getPrice() {
        return price;
    }
 
    public void setPrice(P price) {
        this.price = price;
    }
    public F getFood(){
        return food;
   
    }
    public void setFood(P price){
        this.price = price;
    }
 
    public String toString() {
        return "MenuItem [food = " + this.food + ", price = " + this.price + "]";
    }
}
 
