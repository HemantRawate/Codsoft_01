import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int num = random.nextInt(100) + 1; 
            int attempt = 10; 
            boolean guessNum = false;
            int Score = 0;

            System.out.println("Guess the number between 1 and 100. You have 10 attempts.");

            while (attempt > 0 && !guessNum) {
                System.out.println("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempt--;

                if (userGuess == num) {
                    guessNum = true;
                    Score += attempt; 
                    System.out.println("Congratulations! You guessed the number.");
                } else if (userGuess < num) {
                    System.out.println("Too low! Try again with a higher number.");
                    System.out.println("Attempts left: " + attempt);
                } else {
                    System.out.println("Too high! Try again with a lower number.");
                    System.out.println("Attempts left: " + attempt);
                }
            }

            if (!guessNum) {
                System.out.println("Sorry, you've run out of attempts. The number was " + num);
            }

            System.out.println("Your score: " + Score);
            System.out.println("Do you want to play again? (yes/no)");
            sc.nextLine(); 
            String Str = sc.nextLine().trim().toLowerCase();

            if (!Str.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}
