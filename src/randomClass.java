import java.sql.SQLOutput;
import java.util.Random;

public class randomClass {
    public static void main(String[] args) {

        Random random = new Random(); // Open the Random Class

        // THE DECLARATION OF VARIABLES
        int number1;
        int number2;
        double number3;
        boolean isHeads;

        // THE RANDOMS
        number1 = random.nextInt(1, 101); // (Input a range here!, Separate)
        number2 = random.nextInt(1, 101);
        number3 = random.nextDouble(); // Doubles
        isHeads = random.nextBoolean(); // Booleans

        // THE OUTPUTS
        System.out.println("Your random numbers are: " + number1 + " " + number2 + " " + number3);

        // THE IF FOR HEADS
        if(isHeads) {
            System.out.println("You rolled Heads");
        } else {
            System.out.println("You rolled Tails");
        }
    }
}
