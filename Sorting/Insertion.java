package My_DSA_Journey.Sorting;

public class Insertion {
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};

        for (int i = 0; i< arr.length-1; i++){
            int temp = arr[i+1];
            for (int j = i; j>=0; j--){
                if (arr[j]>temp){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
