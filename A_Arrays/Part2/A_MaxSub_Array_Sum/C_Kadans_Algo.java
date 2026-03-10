package My_DSA_Journey.Arrays.Part2.A_MaxSub_Array_Sum;

public class C_Kadans_Algo {

    public static void Kadans(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max. Value is : " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        Kadans(numbers);

    }
}
