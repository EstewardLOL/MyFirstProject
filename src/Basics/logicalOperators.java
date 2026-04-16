package Basics;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {

        // && AND : all conditions must be true
        // || OR : only one condition can be true
        // ! NOT : opposite

        // Username Checker: 4-12 Chars ; No contain spaces or _
        boolean isValid;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String user = scanner.next();

        if (user.length() < 4 || user.length() > 20) { // if user=esteward; atleast 1 condition is true
            System.out.println("Username must be 4-20 characters long");
        } else {
            System.out.println("Welcome! " + user);
        }

        scanner.close();
    }
}
