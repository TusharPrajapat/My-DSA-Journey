package My_DSA_Journey.Recursion;

public class First_Occurrence_in_UnSorted_Array {
    public static int FirstOccurrence(int[] arr, int key, int i){
        if (i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return FirstOccurrence(arr,key,i+1);
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,5,1};
        int key = 1;
        int i = 0;

        System.out.println("Element found at index:- " + FirstOccurrence(arr,key,i));
    }
}
