package Inheritance;

// Our Dog class will inherit attributes from our Animal class
public class InheritanceDog extends InheritanceAnimal {
    
    // Kung anong meron sa parent class, meron din dito sa child class
    // This is the child class (subclass) that inherits from the parent class (superclass)



    // The subclass can also have its own attributes and methods in addition to the ones it inherits from the superclass
    int lives = 1;

    void bark() {
        System.out.println("The dog barks.");
    }

}
