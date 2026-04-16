import java.util.Scanner;

public class userInputInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Size = once set, you cant change; you need to give a size

        // Build me a shelf with the size of 3 that are empty
        String[] foods = new String[3];

        /*
        Round 1: i is 0. You ask the user for input. Whatever they type goes into foods[0].
        Round 2: i is 1. The next input goes into foods[1].
        and so on...

        foods[i] = scanner.next(); Uses the counter (i) as the address for where to store the data.
         */
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food" + "(" + i + "): ");
            foods[i] = scanner.nextLine();
        }


        // Walk up to the 'foods' shelf. For every item you find, grab it, call it 'food', and print it out.
        for(String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
