package MatrixsQuestions;

public class RepeatNo {
    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 4, 5 }, { 9, 8, 7, 5 }, { 9, 1, 33, 45 }, { 4, 5, 77, 1 } };
        int sum = 0;
        int key = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    sum++;
                }
            }

        }
        System.out.println(sum);
    }

}
