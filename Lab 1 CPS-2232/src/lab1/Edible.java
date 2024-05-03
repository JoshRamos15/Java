package lab1;

interface Edible {
	abstract String howToEat();
	default String howToCook(){
		return "Boil";
	}
}
