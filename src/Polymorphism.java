public class Polymorphism {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Polymorphism = Poly ; Many
        //                Morph ; Shape
        //                Objects can Identify as other objects

        // Dog identifie as a dog, or as an animal, or even an organism, or even a object
        // Dog: Can be identified as more than one

        Car car = new Car();
        car.go();

        Bike bike = new Bike();
        bike.go();

        Boat boat = new Boat();
        boat.go();

        // See, this wont work. Because both bike and boat don't have the shape of a car; They are not compatible with eachother.
        // Car[] cars = {car, bike, boat}


        // Now all of our objects can relate, because they are all a vehicle.
        Vehicle[] vehicles = {car, bike, boat};

    }
}
