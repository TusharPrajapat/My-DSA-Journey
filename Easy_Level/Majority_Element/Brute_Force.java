package My_DSA_Journey.Easy_Level.Majority_Element;

public class Brute_Force {
    public static void main(String[] args){
//        int[] nums = {3,2,3};
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length/2;


        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j< nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }

            if (count>n){
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
