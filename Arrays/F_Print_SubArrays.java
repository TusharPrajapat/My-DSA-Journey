package My_DSA_Journey.Arrays;

public class F_Print_SubArrays {
    public static void Print_SubArrays(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            int sum = 0;
//            int curr = num[i];
//            System.out.println(curr);

            for (int j = i; j < num.length; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }

                System.out.print("Sum : " + sum);

                if (largest < sum) {
                    largest = sum;
                }

                if (smallest > sum) {
                    smallest = sum;
                }

                sum = 0;
                System.out.println();
            }

            System.out.println("Largest Value : " + largest);
            System.out.println("Smallest Value : " + smallest);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        Print_SubArrays(num);
    }
}
