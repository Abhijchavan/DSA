public class Search_Matrix {
    public static boolean Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            // found
            if (matrix[row][col] == key) {
                System.out.println("Key is Found at cell " + row + " " + col);
                return true;
            }
            // left
            else if (key < matrix[row][col]) {
                col--;
            }
            // bottom
            else {
                row++;
            }
        }
        System.out.println("Key does not Exist");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int key = 16;
        Search(matrix, key);
    }
}
