package codsoft;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            boolean guessedCorrectly = false;
            int attemptsLimit = 5; // Limiting attempts per game

            while (attempts < attemptsLimit) {
                System.out.print("\nEnter your guess (1-100): ");
                int userGuess = 0;
                try {
                    userGuess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                attempts++;
                totalAttempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try guessing a higher number.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try guessing a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nSorry, you've run out of attempts. The number was " + secretNumber + ".");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().trim().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + roundsWon);
        System.out.println("Total attempts made: " + totalAttempts);

        if (roundsWon > 0) {
            double averageAttempts = (double) totalAttempts / roundsWon;
            System.out.printf("Average attempts per round: %.2f\n", averageAttempts);
        }

        System.out.println("Thank you for playing!");

        scanner.close();
    }
}



