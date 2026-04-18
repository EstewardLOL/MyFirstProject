package Inheritance;
public class SuperPerson {
        
        String first;
        String last;

        // Since the parent has a constructor that takes parameters, we need to create a constructor in the child class that also takes parameters and calls the parent constructor using the super keyword to give the parent the information it needs to initialize the attributes.
        SuperPerson(String first, String last) {
            this.first = first;
            this.last = last;
        }

        // this = Refers to the current object)
        void introduce() {
            System.out.println("Hello, my name is " + this.first + " " + this.last);
        }
}
