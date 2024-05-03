package hw_assignment3;

/**
 * This class represents a human entity.
 * Humans have properties of:
 * 1. Nationality
 * 2. Hieght
 * 3.Weight
 * 4. Gender
 * 
 * A human does the following functions:
 * 1. Work()
 * 2. Sleep()
 * 3. Eat()
 * 4. Walk()
 */
class Human {

    private String Nationality;
    private int Hieght;
    private int Weight;
    private String Gender;

    public void Work() {
        System.out.println("A human has to work");
    }

    public void Sleep() {
        System.out.println("A human has to sleep");
    }

    public void Eat() {
        System.out.println("A human has to eat");
    }

    public void Walk() {
        System.out.println("A human has to walk");
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public int getHieght() {
        return Hieght ;
    }

   
    public void setHieght(int Hieght) {
    	this.Hieght = Hieght;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        Gender = Gender;

        @Override
        public String toString() {
            return "Human{" +
                    "Nationality='" + colour + '\'' +
                    ", Hieght='" + species + '\'' +
                    ", Weight=" + age +
                    ", Gender=" + Gender +
                    '}';
    }


	
}
