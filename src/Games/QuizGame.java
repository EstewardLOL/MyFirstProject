package Games;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        String[] questions = {"What is my name?", // 0
                              "What is my age?", // ...
                              "Where do I live",
                              "What school do I go to",
                              "Am I a Gamer?"};

        String[][] options = {
                            {"1. Esteward", "2. Steve", "3. Alex"}, // 0
                            {"1. 15", "2. 16", "3. 99"}, // ...
                            {"1. Umingan,Pagasinan", "2. Umingan,Pangagaan", "3. Umingan, Pangasinan"},
                            {"1. UNHS", "2. HOMSAT", "3. UCES"},
                            {"1. Yes", "2. No", "3. Probably"}
                            };

        int[] answers = {1, 1, 3, 1, 1}; // Answer  Key
        int score = 0;
        int guess; // 1 through 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********");
        System.out.println("Welcome! Let's see if you know anything about me!");
        System.out.println("**********");

        for(int i = 0; i < questions.length; i++) { // Loop this to the length of questions. Increment by 1 everytime code finishes
            System.out.println(questions[i]); // i will start at 0! then it will end in 5!

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                score++;
            }
        }

        System.out.println("Final Score: " + score + " out of " + questions.length);

        scanner.close();

        // QUESTIONS DataStructures.array[]
        // OPTIONS DataStructures.array[][]
        // DECLARE Basics.variables
        // Welcome!
        // Questions: Loops
        //      Options
        //      Get guess from user
        //      check our guess
        // Final Score




    }

}
