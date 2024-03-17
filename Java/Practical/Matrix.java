import java.util.Scanner;
import java.util.Random;

class MyCustomException extends Exception {
    // Constructor to initialize the exception with a message
    public MyCustomException(String message) {
        super(message);
    }
}

public class Matrix extends Exception {

    public static int[][] multiply(int[][] mat1, int row1, int col1, int[][] mat2, int row2, int col2)
            throws MyCustomException {
        if (col1 != row2) {
            throw new MyCustomException("You must be at least 18 years old.");
        }

        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] createMat(Scanner sc, int row, int col) {
        int[][] matrix = new int[row][col];

        Random random = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // System.out.print("Enter the matrix elment row = " + i + " col = " + j + " :
                // ");
                // matrix[i][j] = sc.nextInt();
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }

        return matrix;
    }

    public static void print(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat1 = createMat(sc, 2, 2);
        System.out.println("The matrix 1 : ");
        print(mat1, 2, 2);

        int[][] mat2 = createMat(sc, 2, 2);
        System.out.println("The matrix 2 : ");
        print(mat2, 2, 2);

        try {
            int[][] result = multiply(mat1, 2, 2, mat2, 2, 2);
            System.out.println();
            System.out.println("The Matrix Multipication is ");
            System.out.println();
            print(result, 2, 2);
        } catch (MyCustomException e) {
            System.err.println(e);
        }

        sc.close();
    }
}
