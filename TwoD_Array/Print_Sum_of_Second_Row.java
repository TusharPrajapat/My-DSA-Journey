//Print out the sum of the numbers in the second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

package My_DSA_Journey.TwoD_Array;

public class Print_Sum_of_Second_Row {
    public static void print_Sum(int[][] nums){
        int row = 1; //2nd row fixed
        int sum = 0;

        for (int col = 0; col < nums[1].length; col++){
            sum += nums[row][col];
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        int[][] nums = { {1,4,9},{11,8,3},{2,2,3} };
        print_Sum(nums);
    }
}
