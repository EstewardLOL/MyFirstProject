package OOP;
public class Friend {

        // Notice that the Friend class does not have a static variable or method, which means that each instance of Friend will have its own name attribute. This is an example of a non-static variable, which is unique to each object created from the class.
        // Friend class, attributes of a friend
        
        // Static variable to keep track of the number of friends created; this variable is shared among all instances of the Friend class, meaning that it will be the same for all Friend objects.
        // Instead of it having a copy to each Friend object, it is shared among all instances of the Friend class, so it will be the same for all Friend objects. 
        static int numOfFriends = 0;
        String name;
        
        Friend(String name) {
            this.name = name;
            
            // Increment the number of friends each time a new Friend object is created
            numOfFriends++;
        }

        static void displayNumOfFriends() {
            System.out.println("Total number of friends: " + numOfFriends);
        };

}
