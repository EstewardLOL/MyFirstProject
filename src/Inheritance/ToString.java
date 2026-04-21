package Inheritance;
public class ToString {
    public static void main(String[] args) {
        
    
    // Without toString(): Java prints the object's ID badge (boring numbers).

    // With toString(): Java prints the object's actual personality (the name, age, etc.).


    // This is an car object
    ToStringCar car = new ToStringCar("BMW", "M3", 2020, "Black");

    // This by default will print boring numbers(Hash Code, its a Unique Identifier)
    // System.out.println(car); 
    
    // This will now print the actual details of the car because we have overridden the toString() method in the ToStringCar class. The toString() method is called when we try to print the object, and it returns a string representation of the object instead of the default hash code.
    System.out.println(car);
    
    // Alternatively you could also do this but its lame
    System.out.println(car.make + " " + car.model + " " + car.year + " " + car.color);

    

    }
}
