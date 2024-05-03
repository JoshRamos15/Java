package Generics;

public interface Servable <F, P> {
	 
    public F whatToServe();
 
    public void printPrice();
 
    public void displayItem(Servable<F, P> s);
}
