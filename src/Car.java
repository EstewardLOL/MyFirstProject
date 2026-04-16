public class Car {

    // A characteristic that a car has (Attributes)
    String make = "Lamborghini";
    String model = "Veneno";
    int year = 2026;
    double price = 100000;
    boolean isRunning = false;

    void start(){ // No need for static!
        System.out.println("Starting the engine!");
        isRunning = true;
    }
    void stop(){ // Methods
        System.out.println("Stopping the engine!");
        isRunning = false;
    }

    void drive(){
        System.out.println("Is driving!");
    }

    void brake(){
        System.out.println("You braked:D");
    }
}
