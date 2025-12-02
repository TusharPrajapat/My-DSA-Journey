package My_DSA_Journey.Sorting.Divide_AND_Conquer;

public class QuickSort_Using_Recursion {
    public static void Quick_Sort(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }

        int pidx = partitionIndex(arr, si, ei);
        Quick_Sort(arr, si, pidx-1);
        Quick_Sort(arr,pidx+1,ei);
    }

    public static int partitionIndex(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j<ei; j++){
            if (arr[j]<=pivot){
                i++;
                //Swap(arr[i] <--> arr[j])
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;    //temp = pivot     or      temp = arr[ei]
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {6,3,9,8,2,5};
        Quick_Sort(arr,0, arr.length-1);
        printarr(arr);
    }
}
