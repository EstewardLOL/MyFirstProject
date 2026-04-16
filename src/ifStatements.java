import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        // If statement = performs a block of code when condition true
        /*
        if (condition here) {
             action here
        }
         */

        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = scanner.next();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student? ");
        isStudent = scanner.nextBoolean();
        scanner.close();

        // isStudent GROUP BOOLEAN
        if(isStudent) {
            System.out.println("That's great keep up the studying!");
        } else {
            System.out.println("Congratulations you did it!");
        }

        // NAME GROUP STRING
        if(name.isEmpty()) { // You could use "isEmpty" on strings; The output is true/false
            System.out.println("Please Input your name!");
        } else {
            System.out.print("Hello " + name + "!");
        }

        // AGE GROUP INTEGER
        if (age < 0) {
            System.out.println(" Your are not borned yet!");
        } else if (age < 18) {
            System.out.println(" Your are a Minor!");
        } else {
            System.out.println("Your are a Adult!");
        }
    }
}


