package My_DSA_Journey.Arrays.Part2;

public class B_Trapping_Rain_Water {
    public static int TrappingRainWater(int height[]) { //T.C. --> O(n) [Most Optimal Solution]
        int n = height.length;

        //Calculate left max boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //Calculating Right max Boundry - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trapperWater = 0;

        //Calculate Water Trapped
        //Loop
        for (int i = 0; i < n; i++) {
            //WaterLevel = min(leftMax Bound, rightMax Bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = water level - height[i]
            trapperWater += waterLevel - height[i];
        }

        return trapperWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappingRainWater(height));
    }
}
