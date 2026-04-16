package DataStructures;// import java.util.Scanner;

public class searchingAnArray {
    public static void main(String[] args) {

        String[] foods = {"Pizza", "Taco", "Hatdog", "Sushi", }; // Our "fridge" of foods
        String target = "pizza";                  // The specific "food" we are looking for
        boolean isFound = false; // We start with false because we haven't even looked yet!

        // 3. THE SEARCH (Looking at the fridge)
        for(int i = 0; i < foods.length; i++){ // Keep going as long as "i" is less than length
            if (foods[i].equalsIgnoreCase(target)) {
                System.out.println("Found at Index: " + (i + 1));
                isFound = true; // Set our flag to true so we remember we found it
                break;          // Stop the loop! No need to keep looking if we found it.
            }
            // Notice: There is no 'else' here. If it's not the target,
            // the loop just moves to the next 'i' quietly.
        }
        // This only runs ONCE after the loop is completely finished.
        // If isFound is still false, it means we checked every box and saw nothing.
        if (!isFound) {
            System.out.println("Not found!");
        }
    }
}