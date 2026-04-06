package My_DSA_Journey.G_Recursion;

public class C_Find_Fact_Of_N {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

//      n! = n × (n - 1)!
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
