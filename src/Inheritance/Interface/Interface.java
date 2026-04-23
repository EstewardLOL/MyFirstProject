package Inheritance.Interface;
public class Interface {
    public static void main(String[] args) {
        
        // Interface = A class can have multiple parents.
        /*
        Example of what is happening here: 
        Since Rabbit implements from Prey, and Prey has a method of flee();
        The children must finish the job by initializing the method that the parent gave.
        */

        // It uses implements instead of extends

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

    }
}
