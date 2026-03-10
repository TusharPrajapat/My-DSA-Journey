package My_DSA_Journey.Arrays.Part1;

public class D_Reverse_an_Array {
    public static void Reverse_Array(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.print("Before : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Reverse_Array(arr);

        System.out.print("After : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
