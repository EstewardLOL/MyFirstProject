import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * variable that could store more than 1 value

        // Array of string, all are same data type
        String[] fruits = {"Apple", "Orange", "Watermelon", "Orange"};

        // Printing fruits will give memory address, you should instead specify an index
        System.out.println(fruits[0]); // Typing 0 will give you "Apple"

        // You could also change the value of an array
        fruits[1] = "Pineapple"; // We will change INDEX 1; Orange to Pineapple
        System.out.println(fruits[1]); // Since we changed the value of INDEX 1 you now will be given a Pineapple

        // How to get the length of an array(return int):
        System.out.println("You have " + fruits.length + " elements:");

        // Printing all elements using a [for-loop]
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]); // "i" is added by 1 every loop until it is the same size as array "fruit"
            // Adding +1 everytime makes it so it prints everything in that array
        }

        System.out.println();

        // Sorts the array "Fruits" first before giving it to the bottom
        Arrays.sort(fruits);
        // You could even do an enhanced loop[for each loop]
        for(String fruite : fruits) { // Basically: For every fruit in my array of fruits. Do this
            System.out.println(fruite); // Printing each fruit
        }

        System.out.println();

        // Fill every element in array "Fruit" with: Daddy
        Arrays.fill(fruits, "Daddy");

        // This will now output "Daddy" for every element in array: fruits
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
