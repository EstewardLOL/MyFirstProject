package games;

import java.util.*;

public class dice {

    static int roll; // so all methods can access

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("How many dice to roll: ");
        if (sc.hasNextInt()) {
            numOfDice = sc.nextInt();

            if (numOfDice > 0) { // so no negative rolls
                for (int i = 0; i < numOfDice; i++) { // rolls till i is the same as numOfDice

                    roll = random.nextInt(1, 7); // 1 to 6
                    die(); // calls method die
                    System.out.println("You rolled: " + roll); // prints number of each roll
                    total += roll; // totals all rolls

                }
            } else { // if a negative number
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Please enter a valid number!");
            return; // why continue if not valid
        }
        sc.close();

        System.out.println("Total of rolls is: " + total); // prints the totals of all rolls

    }

    static void die() {
        String die1 = """
                 --------------
                |              |
                |              |
                |      ●       |
                |              |
                |              |
                 --------------
                """;
        String die2 = """
                 --------------
                | ●            |
                |              |
                |              |
                |              |
                |            ● |
                 --------------
                """;
        String die3 = """
                 --------------
                | ●            |
                |              |
                |      ●       |
                |              |
                |            ● |
                 --------------
                """;
        String die4 = """
                 --------------
                | ●          ● |
                |              |
                |              |
                |              |
                | ●          ● |
                 --------------
                """;
        String die5 = """
                 --------------
                | ●          ● |
                |              |
                |      ●       |
                |              |
                | ●          ● |
                 --------------
                """;
        String die6 = """
                 --------------
                | ●          ● |
                |              |
                | ●          ● |
                |              |
                | ●          ● |
                 --------------
                """;

        switch(roll) {
            case 1 -> System.out.println(die1); // runs this if roll = 1;
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
            default -> System.out.println("Invalid roll");
        }

    }
}
