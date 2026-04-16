public class OOP {
    public static void main(String[] args) {


        // Object = Entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It's a reference data type

        Car car = new Car();

        System.out.println("This wont work! " + car); // Wouldn't work = Reference

        // car.isRunning = true; // Change an attribute's return value

        car.stop(); // Call the start method

        // Dot operator = access things within an object
        System.out.println(car.year); // Gets the year attribute
        System.out.println(car.isRunning);



    }
}
