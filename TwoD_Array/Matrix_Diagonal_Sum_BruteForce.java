package My_DSA_Journey.TwoD_Array;

//BruteForce Approach --> T.C = O(n*2)
public class Matrix_Diagonal_Sum_BruteForce {
    public static void Diagonal_Sum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        Diagonal_Sum(matrix);
    }
}
