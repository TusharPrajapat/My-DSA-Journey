package My_DSA_Journey.Sorting;

public class Selection {
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};

        for (int i = 0; i<arr.length-1;i++ ){
            int min  = arr[i];
            int small = i;

            for (int j = i+1; j< arr.length; j++){
                if (arr[j]<arr[small]){
                    small = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
