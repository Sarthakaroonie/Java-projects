import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Matrix Operations Program");
        while(running) {
            printmenu();
            int choice = scanner.nextInt();

            switch(choice) {
                case 1 -> handleAdd();
                case 2 -> handleSubtract();
                case 3 -> handleMultiply();
                case 4 -> handleTranspose();
                case 5 -> handleScalarMultiplication();
                case 6 -> {
                    running = false;
                    System.out.println("Thanks for playing!");
            }   
                default -> System.out.println("Invalid choice. Please try again."); 
        }
    }   scanner.close();

    }
    private static void printmenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Add Matrices");
        System.out.println("2. Subtract Matrices");
        System.out.println("3. Multiply Matrices");
        System.out.println("4. Transpose Matrix");
        System.out.println("5. Scalar Multiplication");
        System.out.println("6. Exit");
    }
}
