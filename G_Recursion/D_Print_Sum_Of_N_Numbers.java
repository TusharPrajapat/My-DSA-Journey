package My_DSA_Journey.G_Recursion;

public class D_Print_Sum_Of_N_Numbers {
    public static void print(int n, int i, int sum) {
        if (n == i) {
            sum = sum + i;
            System.out.println("Sum:- " + sum);
            return;
        }
        print(n, i + 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 5;
        print(n, 1, 0);
    }
}
