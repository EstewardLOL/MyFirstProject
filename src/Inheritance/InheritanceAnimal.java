package Inheritance;
public class InheritanceAnimal {
 
    // This is the parent class (superclass)
    // Kung anong meron dito, meron din sa mga child class (subclass)


    boolean isAlive = true;

    InheritanceAnimal() {
        this.isAlive = true;
    }



    void eat() {
        System.out.println("This animal eats food.");
    }


}
