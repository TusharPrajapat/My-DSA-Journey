package My_DSA_Journey.Sorting.Divide_AND_Conquer;

public class MergeSort_Using_Recursion {
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int[] arr, int si, int ei){
        if (si >= ei) {
            return; // base case: only one element
        }
        int mid = si + (ei - si)/2;
        merge_sort(arr,si,mid); //left part partitioning
        merge_sort(arr,mid+1, ei); //right part partitioning
        merge(arr,si,mid,ei); //merging
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<= ei){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }

            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= ei){
            temp[k++] = arr[j++];
        }

        for (k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] Args){
        int[] arr = {6,3,9,5,2,8};
        merge_sort(arr,0, arr.length-1);
        printArr(arr);
    }
}
