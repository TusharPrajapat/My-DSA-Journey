package My_DSA_Journey.Sorting;

public class Count {
    public static void count_sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int[] count = new int[largest+1];
        for (int i = 0; i< arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i< arr.length; i++){
            while (count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        count_sort(arr);

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
