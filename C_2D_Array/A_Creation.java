package My_DSA_Journey.C_2D_Array;

import java.util.Scanner;

public class A_Creation {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter numbers: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
