package My_DSA_Journey.Arrays.Part1;

public class C_Binary_Search {
    public static int Binary_Search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
//            System.out.println("start = " + start);
//            System.out.println("End =  " + end);

            int mid = start + (start + end) / 2;
//            System.out.println("mid =  " + mid);

            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                start = mid + 1;
//                System.out.println("Start 2 = "+ start);
//                System.out.println();
            } else {
                end = mid - 1;
                System.out.println("End 2 =  " + end);
                System.out.println();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println(Binary_Search(number, key));
        System.out.println(number.length);
    }
}
