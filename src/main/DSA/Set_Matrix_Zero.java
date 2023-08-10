import java.util.Scanner;

public class Set_Matrix_Zero {
    public static void setMatrixZeros(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        int[][] temp = new int[M][N];

        // Initialize the temp matrix with all ones
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = 1;
            }
        }

        // Mark rows and columns with zeros in the temp matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 0) {
                    for (int k = 0; k < M; k++) {
                        temp[k][j] = 0;
                    }
                    for (int k = 0; k < N; k++) {
                        temp[i][k] = 0;
                    }
                }
            }
        }

        // Copy the temp matrix back to the original matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setMatrixZeros(matrix);

        System.out.println("\nMatrix with Rows and Columns Set to Zeros:");
        printMatrix(matrix);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
