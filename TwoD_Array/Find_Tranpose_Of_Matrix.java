//Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns.
// For a 2x3 matrix,

// Matrix
// a11    a12    a13
// a21    a22    a23

// Transposed Matrix
// a11    a21
// a12    a22
// a13    a23

package My_DSA_Journey.TwoD_Array;

public class Find_Tranpose_Of_Matrix {
    public static void Transpose(int[][] matrix, int row, int col){
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];

            }
        }

        for (int i = 0 ; i < transpose.length; i++){
            for (int j = 0 ; j < transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6}};
        int row = 2;
        int col = 3;

        Transpose(matrix,row,col);

    }
}
