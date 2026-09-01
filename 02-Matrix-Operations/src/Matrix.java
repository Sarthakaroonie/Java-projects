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

    //Operations:

    private static void handleAdd() {
        // Implementation for adding matrices
        System.out.println("Add Matrices operation selected.");
        int [][] a = readMatrix(scanner, "A");
        int [][] b = readMatrix(scanner, "B");

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            return;
        }
        int [][] result = addMatrices(a, b);
        System.out.println("Matrices added!");
        System.out.println("Result:");
        printMatrix(result);
    }

    private static void handleSubtract() {
        // Implementation for subtracting matrices
        System.out.println("Subtract Matrices operation selected.");
        int [][] a = readMatrix(scanner, "A");
        int [][] b = readMatrix(scanner, "B");

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for subtraction.");
            return;
        }
        int [][] result = subtractMatrices(a, b);
        System.out.println("Matrices subtracted!");
        System.out.println("Result:");
        printMatrix(result);
    }

    private static void handleMultiply() {
        // Implementation for multiplying matrices
        System.out.println("Multiply Matrices operation selected.");
        int [][] a = readMatrix(scanner, "A");
        int [][] b = readMatrix(scanner, "B");

        if (a[0].length != b.length) {
            System.out.println("Error: Number of columns in Matrix A must equal number of rows in Matrix B for multiplication.");
            return;
        }
        int [][] result = multiplyMatrices(a, b);
        System.out.println("Matrices multiplied!");
        System.out.println("Result:");
        printMatrix(result);
    }

    private static void handleTranspose() {
        // Implementation for transposing a matrix
        System.out.println("Transpose Matrix operation selected.");
        int [][] a = readMatrix(scanner, "A");
        
        int [][] result = transposeMatrix(a);
        System.out.println("Matrix transposed!");
        System.out.println("Result:");
        printMatrix(result);
    }

    private static void handleScalarMultiplication() {
        // Implementation for scalar multiplication
        System.out.println("Scalar Multiplication operation selected.");
        int [][] a = readMatrix(scanner, "A");

        System.out.print("Enter scalar value: ");

        int scalar = scanner.nextInt();

        int [][] result = scalarMultiplyMatrix(a, scalar);
        System.out.println("Matrix multiplied by scalar!");
        System.out.println("Result:");
        printMatrix(result);
    }


}
