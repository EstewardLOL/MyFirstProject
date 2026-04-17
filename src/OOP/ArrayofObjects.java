package OOP;
public class ArrayofObjects {
    public static void main(String[] args) {    

        // These are an example of Anonymous objects, because they are not assigned to a variable. They are created and used immediately.
        /* Vehicle[] vehicles = {
            new Vehicle("Toyota", "Camry"),
            new Vehicle("Honda", "Civic")
        }; */
        
        // Vehicle objects, Initializing the attributes of the Vehicle class
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry"); // 1st Vehicle object, Index 0
        Vehicle vehicle2 = new Vehicle("Honda", "Civic"); // 2nd Vehicle object, Index 1

        // New array of Vehicle objects(Combining the 2 Vehicle objects into an array)
        Vehicle[] vehicles = {vehicle1, vehicle2};

        // For every vehicle in the array of vehicles, do the following
        for (Vehicle vehicle : vehicles) {
            // Print the make and model.
            System.out.println(vehicle.make + " " + vehicle.model);  
            
            // Call the isDrivable method for each vehicle in the array.
            vehicle.isDrivable(); 
        } 

    }
}
