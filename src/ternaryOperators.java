import java.util.Scanner;

public class ternaryOperators {
    public static void main(String[] args) {

        // ternary operators ?; returns 1 of 2 if condition is true | alt to if statements

        // formula: variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        // Check if even or odd
        //int num;
        //System.out.print("Enter a number:" );
        //num = scanner.nextInt();
        //String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
        //System.out.println(evenOrOdd);

        // Check if AM/PM
        int time = 10; // 1PM in military time
        String amOrPm = (time < 12) ? "AM" : "PM";
        System.out.println(amOrPm);

        int age = 5;
        String status = (age < 0) ? "Not born yet" :
                        (age == 0) ? "A baby" :
                        (age < 18) ? "Minor" : "Adult";
        System.out.println(status);

        scanner.close();
    }
}
