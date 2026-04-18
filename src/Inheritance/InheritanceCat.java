package Inheritance;

// Our Cat class will inherit attributes from our Animal class
public class InheritanceCat extends InheritanceAnimal {

    // Kung anong meron sa parent class, meron din dito sa child class
    // This is the child class (subclass) that inherits from the parent class (superclass)
    

    // THe subclass can also have its own attributes and methods in addition to the ones it inherits from the superclass
    int lives = 9;

    void meow() {
        System.out.println("The cat meows.");
    }

}
