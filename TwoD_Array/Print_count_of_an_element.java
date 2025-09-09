//Print the number of 7’s that are in the 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2


package My_DSA_Journey.TwoD_Array;

public class Print_count_of_an_element {
    public static int Count_Element(int[][] array, int key){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] array = { {4,7,8},{8,8,7} };
        int key = 7;
        System.out.println(Count_Element(array, key));
    }
}

