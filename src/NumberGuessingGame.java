
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        while (true) {

            System.out.println("Enter your guess (1-100)");
            Scanner plG = new Scanner(System.in);
            int playerGuess = plG.nextInt();

            if (randomNumber == playerGuess) {
                System.out.println("Correct answer you win!");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope the answer is higher, try again!");
            } else if (randomNumber < playerGuess) {
                    System.out.println("Nope the answer is lower, try again!");
            }

        }
    }
}