import java.util.Scanner;

public class Sprial_Matrix {
    public static void Spiral(int matrix[][]) {

        int StartRow = 0, StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix.length - 1;
        while (StartRow <= EndRow && StartCol <= EndCol) {
            // Top
            for (int i = StartCol; i <= EndCol; i++) {

                System.out.print(matrix[StartRow][i] + " ");

            }
            // Right
            for (int i = StartRow + 1; i <= EndRow; i++) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][EndCol] + " ");
            }
            // bottom
            for (int i = EndCol - 1; i >= StartCol; i--) {
                if (StartRow == EndRow) {
                    break;

                }
                System.out.print(matrix[EndRow][i] + " ");
            }
            // Left
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                System.out.print(matrix[i][StartCol] + " ");
            }
            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Spiral(matrix);
    }
}
