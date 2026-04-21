package Games;

import java.util.*;

public class numberGuesserGame {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = random.nextInt(1, 51);
        int max = random.nextInt(51, 101);

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        int randomNum = random.nextInt(min, max + 1);

        System.out.printf("Guess a random number between: %d-%d\n", min, max);

        do{ // do these codes first | TOP
            System.out.print("Enter a guess: "); // say to user
            if (scanner.hasNextInt()) { // if the input has numbers proceed
                guess = scanner.nextInt(); // puts the number input > guess variable
                attempts++; // adds the number to num of attempts

                if (guess < randomNum) { // if guess is low
                    System.out.println("Too low!"); // do this
                } else if (guess > randomNum) { // if guess is high
                    System.out.println("Too high!"); // do this
                } else { // if none of the above is true
                    System.out.printf("You guessed the number: %d in %d attempt(s)!", randomNum, attempts); // do this
                }
            } else { // if the input doesn't contain numbers | tip put all errors at last.
                System.out.println("Invalid input! Numbers only!");
                scanner.next(); // swallows the invalid input > returns to the top
            }

        } while(guess !=randomNum); // the checker, if the guess is not the random number go to top

        scanner.close();
    }
}

