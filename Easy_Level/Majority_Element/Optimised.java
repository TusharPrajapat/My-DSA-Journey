//Boyer–Moore Voting Algorithm
//T.C -> O(n)

package My_DSA_Journey.Easy_Level.Majority_Element;

public class Optimised {
    public static void majorityElement(int[] nums){
        int count = 0;
        int element = 0;

        for (int i = 0; i < nums.length; i++){

            if (count == 0){
                element = nums[i];
            }

            if (element == nums[i]){
                count++;
            } else{
                count --;
            }
        }

        System.out.println("Majority Element:- "+element);
    }

    public static void main(String[] args){

        int[] nums = {3,2,3};
//        int[] nums = {2,2,1,1,1,2,2};
        majorityElement(nums);
    }
}
