package My_DSA_Journey.Recursion;

public class Last_Occurrence_in_UnSorted_Array {
    public static int LastOccurrence(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = LastOccurrence(arr, key, i+1);

        if (isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,5,1};
        int key = 5;
        int i = 0;

        System.out.println("Element found at index:- " + LastOccurrence(arr,key,i));
    }
}
