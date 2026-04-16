package FlowControl;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {

        // while loops = repeats some code forever while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name1 = "";
        String name2 = "";

        while(name1.isEmpty()) { // While loop while name.isEmpty = true
            System.out.print("Please input a name: ");
            name1 = scanner.nextLine();
        }

        do{
            System.out.print("Please input a name: "); // do this first
            name2 = scanner.nextLine();
        } while(name2.isEmpty()); // before checking

        // prints name in Capital format
        System.out.println("Hello! " + name1.substring(0, 1).toUpperCase() + name1.substring(1).toLowerCase());
        System.out.println("Hello! " + name2.substring(0, 1).toUpperCase() + name2.substring(1).toLowerCase());

        scanner.close();
    }
}
