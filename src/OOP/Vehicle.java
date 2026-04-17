package OOP;

public class Vehicle {
        
        // Attributes of a vehicle
        String make;
        String model;

        // Constructor to initialize the attributes
        Vehicle(String make, String model) {
            this.make = make;
            this.model = model; 
    }

    // A Method to call, that the vehicle is drivables
    void isDrivable() {
        System.out.println("The " + make + " " + model + " is drivable.");
    }
}   
