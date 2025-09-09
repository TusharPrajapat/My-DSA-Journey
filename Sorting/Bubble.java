package My_DSA_Journey.Sorting;

public class Bubble {
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        System.out.println(arr.length);
        for (int i = 0; i <= arr.length-1; i++){
            for (int j = 0; j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0;i < arr.length; i++){
            System.out.print(arr[i]);
        }
   }
}
