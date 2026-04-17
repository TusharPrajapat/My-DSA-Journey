package My_DSA_Journey.G_Recursion;

public class K_tilling_problem {
    public static int tiling(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }

        //kaam
        //vertically
        int fnm1 = tiling(n - 1);

        //horizontaly
        int fnm2 = tiling(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}
