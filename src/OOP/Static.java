package OOP;
public class Static {
    public static void main(String[] args) {
        
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
         
        /* 
        Static = Shared. Day, month, and year are the same for everyone. They are shared by the entire class.
        Non-Static = Unique. Height, weight, and eye color are unique to each person. They are not shared by the entire class.
        */
        
        

        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");

        System.out.println(friend1.name); // Output's friend1 object's name.
        System.out.println(friend2.name); // Output's friend2 object's name.

        // Use the name of the class to access the static variable numOfFriends, since it is shared among all instances of the Friend class.
        System.out.println(Friend.numOfFriends); // Output's the total number of friends created; Its in static so its shared by all instances of the Friend class.

        // You can also call the static method displayNumOfFriends() using the class name.
        Friend.displayNumOfFriends(); // Output's the total number of friends created; Its in static so its shared by all instances of the Friend class.

    }
}
