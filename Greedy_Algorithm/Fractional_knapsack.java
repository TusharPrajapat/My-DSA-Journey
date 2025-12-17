//Time Complexity: O(n log n)

//Space Complexity: O(n)

package My_DSA_Journey.Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_knapsack {
    public static int MaxVal(int[] val, int[] weight, int capacity) {
        double[][] ratio = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                break;
            }
        }

        return finalVal;
    }

    public static void main(String[] args) {
//        int[] val = {60,100,120};
//        int[] weight = {10,20,30};
//        int capacity = 50;

        //Dry run on this example will give more clear understanding
        int[] val = {50, 60, 140};
        int[] weight = {5, 10, 20};
        int capacity = 25;


        System.out.println(MaxVal(val, weight, capacity));

    }
}