import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {

        // for loop = execute some code a certain AMOUNT of times: looping the code block 5 times
        // for(initialize; condition; counter) ; for(int i = 0; i < 10; i++)

        // COUNTUP
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        scanner.close();
         */

        // BREAK AND CONTINUE

        // Break; = stop
        // Continue; = skip

        for(int i = 1; i <= 10; i++) {

            // this stops the code when i == 5
            if(i == 5) {
                break;
            }

            System.out.print(i + " ");
        }


    }
}
