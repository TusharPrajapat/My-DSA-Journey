package My_DSA_Journey.B_Basic_Sorting_Algo;

import java.util.Arrays;

public class D_Inbuilt_Sort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        print(arr);
    }
}
