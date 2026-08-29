import java.util.Scanner;
import java.util.Random;

public class Main {
        private static final int Lower_Bound = 1;
        private static final int Upper_Bound = 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            runGameSession(scanner, random);
            playAgain = askToPlayAgain(scanner);
        }

        System.out.println("Thank you for playing!");
        Scanner.close();
    }
