import java.util.Random;
import java.util.Scanner;

public class Main {
        private static final int LOWER_BOUND = 1;
        private static final int UPPER_BOUND = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            runGameSession(scanner, random);
            playAgain = askToPlayAgain(scanner);
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }

    private static void runGameSession(Scanner scanner, Random random) {
        int target = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Target number has been generated between " + LOWER_BOUND + " and " + UPPER_BOUND + ". Try to guess it!\n");

        while (!guessedCorrectly) {
            int guess = readValidInteger(scanner, "Enter your guess: ");    
            attempts++;
            
            if (guess < LOWER_BOUND || guess > UPPER_BOUND) {
                System.out.println("Please enter a number between " + LOWER_BOUND + " and " + UPPER_BOUND + ".");
                continue;
            }

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + target + " in " + attempts + " attempts.");
            }
        }
            
        }
        
        //integer input reader. Prevents application crashes from non-numeric tokens and clears the trailing newline character from the standard input stream.
        private static int readValidInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // consume trailing newline
                return value;
            } else {
                System.out.println("Invalid input. Integers only.");
                scanner.nextLine(); // discard non-integer token
            }
        }
    }
    private static boolean askToPlayAgain(Scanner scanner) {
        while (true) {
            System.out.print("Do you want to play again? (y/n):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y")) {
                return true;
            } else if (response.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }

    }
}