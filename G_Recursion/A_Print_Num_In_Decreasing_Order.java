package My_DSA_Journey.G_Recursion;

public class A_Print_Num_In_Decreasing_Order {
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        printNum(num - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        printNum(n);
    }
}
