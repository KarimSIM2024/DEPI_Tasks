package homework_lec6;

import java.util.Scanner;

public class _2dArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Rows of the Matrix");
        int row = scanner.nextInt();
        System.out.println("Enter Columns of the Matrix");
        int column = scanner.nextInt();
        var matrix1 = new int[row][column];
        var matrix2 = new int[row][column];

        System.out.println("Enter values for the first matrix:");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                System.out.println("Enter Value of [" + i + "][" + j + "]");
                matrix1[i][j] = scanner.nextInt();
            }

        System.out.println("Enter values for the second matrix:");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                System.out.println("Enter Value of [" + i + "][" + j + "]");
                matrix2[i][j] = scanner.nextInt();
            }

        System.out.println("First Matrix:");
        printMatrix(matrix1);
        System.out.println("Second Matrix:");
        printMatrix(matrix2);

        // 1.Average
        var avgMatrix = averageMatrices(matrix1, matrix2);
        System.out.println("Average Matrix:");
        printMatrix(avgMatrix);

        // 2.Summation
        var sumMatrix = sumMatrices(matrix1, matrix2);
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);

        // 3.reverse
        var reversedTranspose1 = reverseTransposeMatrix(matrix1);
        System.out.println("Reversed Transpose of the First Matrix:");
        printMatrix(reversedTranspose1);
        var reversedTranspose2 = reverseTransposeMatrix(matrix2);
        System.out.println("Reversed Transpose of the Second Matrix:");
        printMatrix(reversedTranspose2);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    //  average of two matrices
    public static int[][] averageMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        var avgMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                avgMatrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2;
            }
        }
        return avgMatrix;
    }
    //  sum two matrices
    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        var sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        return sumMatrix;
    }
    // reverse a matrix
    public static int[][] reverseTransposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        var transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[columns - 1 - j][rows - 1 - i] = matrix[i][j];
            }
        }
        return transposed;
    }
}