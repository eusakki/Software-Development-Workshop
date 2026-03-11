import java.util.Random;

public class MatrixDiagonalSum {
    public static void main(String[] args) {

        System.out.println("Developer: Yevtushenko D.V.");

        int[][] A = new int[3][3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\nMatrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            mainDiagonalSum += A[i][i];
            secondaryDiagonalSum += A[i][2 - i];
        }

        System.out.println("\nSummary of the main diagonal elements: " + mainDiagonalSum);
        System.out.println("Summary of the secondary diagonal elements:" + secondaryDiagonalSum);
    }
}