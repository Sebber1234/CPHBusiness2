import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Create a Scanner object

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {

            // Read user input
            int guess = scan.nextInt();

            //use hasNextInt to check if input is numeric,
//            System.out.println("" + scan.hasNextInt());


            // if so...
            if (guess == rnd_number) {

                System.out.println("Yaaaay you guessed the number!");
                break;

            } else if (guess > rnd_number) {

                System.out.println("Too high guess lower!");

            } else if (guess < rnd_number) {

                System.out.println("Too low guess higher!");

            }
            //   Compare it with the random number
            //   Let the user know the result of the comparison (was it the right number?)
            //   If it was NOT the rigth number, let the user try again by calling this method recursively
            //   (If you are not sure how to do recursion, you can use a loop instead)
            //   Help the user by revealing wether the guess was lower or higher than the target number
            // if input was not numeric show an error message and call this method recursively

        }
    }
}
