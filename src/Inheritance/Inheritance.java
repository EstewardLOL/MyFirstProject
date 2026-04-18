package Inheritance;
public class Inheritance {
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods 
        //               from another class
        //               Child <- Parent

        InheritanceDog dog = new InheritanceDog();
        InheritanceCat cat = new InheritanceCat();
    

        // The file doesn't have this variable, but since it inherits from the parent class, we can use it
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);


        // The file doesn't have this method, but since it inherits from the parent class, we can use it
        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        
        dog.bark();
        cat.meow();

    }
}
