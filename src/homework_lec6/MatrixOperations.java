package homework_lec6;

public class MatrixOperations {

    // 1. Add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // 2. Multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // 3. Transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // 4. Find the maximum element in a 2D array
    public static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // 5. Calculate the sum of each row and column
    public static void sumRowsAndColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + colSum);
        }
    }

    // 6. Check if a matrix is symmetric
    public static boolean isSymmetric(int[][] matrix) {
        int[][] transposed = transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != transposed[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 7. Sum of the main diagonal elements
    public static int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // 8. Find the saddle point
    public static void findSaddlePoint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int minRowValue = matrix[i][0];
            int minIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean isSaddlePoint = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minRowValue) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if (isSaddlePoint) {
                System.out.println("Saddle point found at (" + i + ", " + minIndex + ") with value: " + minRowValue);
                return;
            }
        }
        System.out.println("No saddle point found.");
    }

    // 9. Print matrix in spiral order
    public static void printSpiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    // 10. Rotate matrix by 90 degrees clockwise
    public static int[][] rotateMatrix90(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    // 11. Find maximum and minimum elements in a 1D array
    public static void findMaxMinInArray(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    // 12. Find and print duplicate elements in an array
    public static void printDuplicates(int[] array) {
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mat2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[] array = {1, 2, 3, 4, 2, 5, 1, 6};

        // 1. Add two matrices
        int[][] sum = addMatrices(mat1, mat2);
        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 2. Multiply two matrices
        int[][] product = multiplyMatrices(mat1, mat2);
        System.out.println("\nProduct of matrices:");
        for (int[] row : product) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 3. Transpose a matrix
        int[][] transposed = transposeMatrix(mat1);
        System.out.println("\nTransposed matrix:");
        for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 4. Find the maximum element in a matrix
        System.out.println("\nMaximum element in matrix: " + findMaxElement(mat1));

        // 5. Sum of rows and columns
        System.out.println("\nSum of each row and column:");
        sumRowsAndColumns(mat1);

        // 6. Check if matrix is symmetric
        System.out.println("\nIs the matrix symmetric? " + isSymmetric(mat1));

        // 7. Sum of the main diagonal
        System.out.println("\nSum of main diagonal elements: " + sumMainDiagonal(mat1));

        // 8. Find the saddle point
        System.out.println("\nFinding saddle point:");
        findSaddlePoint(mat1);

        // 9. Print matrix in spiral order
        System.out.println("\nMatrix in spiral order:");
        printSpiralOrder(mat1);
        System.out.println();

        // 10. Rotate matrix by 90 degrees clockwise
        int[][] rotated = rotateMatrix90(mat1);
        System.out.println("\nRotated matrix by 90 degrees:");
        for (int[] row : rotated) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 11. Find maximum and minimum elements in a 1D array
        System.out.println("\nMaximum and minimum in array:");
        findMaxMinInArray(array);

        // 12. Print duplicate elements in array
        System.out.println("\nDuplicate elements in array:");
        printDuplicates(array);
        System.out.println();
    }
}