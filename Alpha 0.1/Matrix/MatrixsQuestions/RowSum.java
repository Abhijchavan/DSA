
//Calculate the Sum of 2nd Row 
package MatrixsQuestions;

public class RowSum {
    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 4, 5 }, { 9, 8, 7, 5 }, { 9, 1, 33, 45 }, { 4, 5, 77, 1 } };
        int sum = 0;
        // 2nd row sum
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[1][i];

        }
        System.out.println(sum);
    }

}
