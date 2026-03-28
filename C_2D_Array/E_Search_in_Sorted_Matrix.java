package My_DSA_Journey.C_2D_Array;

public class E_Search_in_Sorted_Matrix {
    public static boolean SearchInMatrix(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        System.out.println("matrix[0].length = " + matrix[0].length);
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found Key at (" + row + "," + col + ")");
                return true;
            }

            //left
            else if (key < matrix[row][col]) {
                col--;
            }

            //bottom
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key = 36;
        System.out.println(SearchInMatrix(matrix, key));
    }
}
