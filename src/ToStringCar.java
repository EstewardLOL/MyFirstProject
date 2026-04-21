public class ToStringCar {

    String make;
    String model;
    int year;
    String color;
    
    ToStringCar(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // The toString() method is available in every object because it is defined in the Object class, which is the superclass of all classes in Java. By default, the toString() method returns a string that consists of the class name followed by the "@" symbol and the object's hash code in hexadecimal. However, we can override this method to provide a more meaningful string representation of our object.

    @Override
    // toString() is a method that is called when you try to print an object. It returns a string representation of the object instead of the default hash code.
    // We use public because we want to be able to access this method from outside the class. We use String as the return type because we want to return a string representation of the object. We use @Override to indicate that we are overriding the default toString() method from the Object class.
    public String toString() {
        return "Car Details: " + this.make + " " + this.model + " " + this.year + " " + this.color;
    }

}
