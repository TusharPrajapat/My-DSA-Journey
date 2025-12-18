package My_DSA_Journey.Greedy_Algorithm.Min_Sum_Absolute_difference_Pairs;

import java.util.Arrays;

public class concept_code {
    public static int minAbsPairDiff(int[] num1, int[] num2){
        int minVal = 0;

        Arrays.sort(num1);
        Arrays.sort(num2);

        for (int i = 0; i < num1.length; i++){
            minVal += Math.abs(num1[i] - num2[i]);
        }

        return  minVal;
    }
    public static void main(String[] args){
        int[] num1 = {1,7,5};
        int[] num2 = {2,3,5};

        System.out.println(minAbsPairDiff(num1, num2));
    }
}
