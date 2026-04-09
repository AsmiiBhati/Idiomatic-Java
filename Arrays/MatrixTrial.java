import java.util.Scanner;

public class MatrixTrial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible (columns of A != rows of B)");
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        // Input elements for Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Input elements for Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Matrix multiplication
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];

        // Display multiplication result
        System.out.println("Matrix A x B:");
        printMatrix(result);

        // Transpose of Matrix A
        System.out.println("Transpose of Matrix A:");
        int[][] transposeA = transpose(A);
        printMatrix(transposeA);

        // Transpose of Matrix B
        System.out.println("Transpose of Matrix B:");
        int[][] transposeB = transpose(B);
        printMatrix(transposeB);
        sc.close();
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];

        return transposed;
    }
}
