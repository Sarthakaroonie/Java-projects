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
                case 1 -> handleAdd(scanner);
                case 2 -> handleSubtract(scanner);
                case 3 -> handleMultiply(scanner);
                case 4 -> handleTranspose(scanner);
                case 5 -> handleScalarMultiplication(scanner);
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

    private static void handleAdd(Scanner scanner) {
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

    private static void handleSubtract(Scanner scanner) {
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

    private static void handleMultiply(Scanner scanner) {
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

    private static void handleTranspose(Scanner scanner) {
        // Implementation for transposing a matrix
        System.out.println("Transpose Matrix operation selected.");
        int [][] a = readMatrix(scanner, "A");

        int [][] result = transposeMatrix(a);
        System.out.println("Matrix transposed!");
        System.out.println("Result:");
        printMatrix(result);
    }

    private static void handleScalarMultiplication(Scanner scanner) {
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

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    public static int[][] scalarMultiplyMatrix(int[][] a, int scalar) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] * scalar;
            }
        }
        return result;
    }

    private static int[][] readMatrix(Scanner scanner, String matrixName) {
        System.out.print("Enter number of rows for Matrix " + matrixName + ": ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix " + matrixName + ": ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for Matrix " + matrixName + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
