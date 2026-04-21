package Games;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        char operator;
        double result = 0;
        boolean success = true;

        // --- VALIDATE FIRST NUMBER ---
        System.out.print("First Num: ");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.close();
            return; // Stops the program early
        }

        // --- GET OPERATOR ---
        System.out.print("Op: ");
        operator = scanner.next().charAt(0);

        // --- VALIDATE SECOND NUMBER ---
        System.out.print("Second Num: ");
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.close();
            return; // Stops the program early
        }

        // --- CALCULATION LOGIC ---
        switch (operator) { // examin operator ; if(operator)
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2); // num1 ^ num2
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: You can't divide by 0!");
                    success = false;
                }
            }
            default -> {
                System.out.println("Invalid Operator!");
                success = false;
            }
        }

        if (success) {
            System.out.printf("Total: %.2f", result);
        }

        scanner.close();
    }
}