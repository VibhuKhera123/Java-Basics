import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for matrix 1:");
        int rows1 = input.nextInt();
        int columns1 = input.nextInt();
        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns for matrix 2:");
        int rows2 = input.nextInt();
        int columns2 = input.nextInt();
        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        input.close();
        if (columns1 != rows2) {
            System.out.println("Multiplication is not possible. Number of columns of matrix 1 must be equal to number of rows of matrix 2.");
            return;
        }
        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Addition is not possible. Both matrices must have the same number of rows and columns.");
            return;
        }
        int[][] product = product(matrix1, matrix2);
        int[][] sum = sum(matrix1, matrix2);
        System.out.println("Product of matrices:");
        printMatrix(product);
        System.out.println("Sum of matrices:");
        printMatrix(sum);
        
    }
    public static int[][] product(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
    public static int[][] sum(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }}
