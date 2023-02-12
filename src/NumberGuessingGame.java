
import java.util.Scanner;

public class NumberGuessingGame {


    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = (int) (100 * Math.random());
        int K = 10;
        int i, guess;

        System.out.println("A number is chosen between 1 to 100.\nGuess the number within 10 trials.");


        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted 10 trials. Better luck next time");

            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[])
    {
        guessingNumberGame();
    }
}
