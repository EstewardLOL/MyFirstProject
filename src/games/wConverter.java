package games;

import java.util.Scanner;

public class wConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERTER PROGRAM
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice; // Option 1 or 2

        System.out.println("1: Convert LBS to KGS");
        System.out.println("2: Convert KGS to LBS");

        System.out.print("Choose an Option: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in kgs is: %.1f", newWeight);
        } else if(choice == 2) {
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in lbs is: %.1f", newWeight);
        } else {
            System.out.println("Invalid Option!");
        }

        // ELSE NO CHOICE
        scanner.close();
    }
}
