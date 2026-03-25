package My_DSA_Journey.C_2D_Array;

public class D_Diagonal_Sum_Optimised {
    public static void printDiagonalOptimised(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            //PD
            sum += matrix[i][i];
            //SD
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printDiagonalOptimised(matrix);
    }
}
