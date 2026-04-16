package games;

import java.util.Scanner;

public class bankGame {

    static Scanner scanner = new Scanner(System.in);
    static int balance = 0; // this can be seen by every method

    public static void main(String[] args) {

        // BANK PROGRAM
        int choice = -1; // Start with -1 so the loop begins

        while(choice != 4){
            System.out.println("\n***************");
            System.out.println("BANK of AMERICA");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Choice: ");

           if(scanner.hasNextInt()) {
               choice = scanner.nextInt();
               switch (choice) {
                   case 1 -> balance();
                   case 2 -> deposit();
                   case 3 -> withdraw();
                   case 4 -> System.out.println("Goodbye!");
                   default -> System.out.println("INVALID: Please enter a number between 1-4");
               }
           } else {
               System.out.println("\nError: That is not a number. Please try again.");
               scanner.next(); // Clear the bad input
               // choice = -1;    // Ensure the loop repeats
           }
        }

        scanner.close();
    }
    static void balance(){
        System.out.printf("\nYour balance is: ₱%,d\n", balance);
    }
    static void deposit(){

        int deposit;

        System.out.printf("\nDepositing: Your current balance is: %,d\n", balance);
        System.out.print("How many would you like to deposit?: ");
        if (scanner.hasNextInt()) {
            deposit = scanner.nextInt();
            if (deposit < 0) {
                System.out.println("Amount can't be negative!");
            } else {
                balance += deposit;
                System.out.printf("Successfully deposited ₱%,d\n", deposit);
            }
        } else {
            System.out.println("\nError: That is not a number.");
            scanner.next();
        }
    }
    static void withdraw(){

        int withdraw;

        System.out.printf("\nWithdrawing: Your current balance is: %,d\n", balance);
        System.out.print("How many would you like to withdraw?: ");
        if (scanner.hasNextInt()) {
            withdraw = scanner.nextInt();

            if (withdraw <= balance && withdraw > 0) {
                balance -= withdraw;
                System.out.printf("Successfully withdrew ₱%,d\n", withdraw);

            } else {
                System.out.println("You are too broke for that!");
            }
        } else {
            System.out.println("\nError: That is not a number.");
            scanner.next();
        }
    }
}