package My_DSA_Journey.G_Recursion;

public class B_Print_Number_In_Increasing_Order {
    public static void printNum(int num, int i) {
        System.out.println(i);
        if (num == i) {
            return;
        }
        printNum(num, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;

        printNum(n, 1);
    }
}
