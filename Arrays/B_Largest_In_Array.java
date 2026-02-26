package My_DSA_Journey.Arrays;

public class B_Largest_In_Array {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; //-infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};

        int largest = getLargest(number);
        System.out.println("Largest Value is : " + largest);

        int smallest = getSmallest(number);
        System.out.println("Smallest Value is : " + smallest);
    }
}
