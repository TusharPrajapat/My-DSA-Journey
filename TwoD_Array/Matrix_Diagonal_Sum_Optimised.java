package My_DSA_Journey.TwoD_Array;

public class Matrix_Diagonal_Sum_Optimised {
    static void Diagonal_Sum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i< matrix.length; i++){
            //PD
            sum+= matrix[i][i];

            //SD
            if (i != matrix.length-1-i){ //--> Protect From Overlapping Condition
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        Diagonal_Sum(matrix);
    }
}
