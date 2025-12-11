package My_DSA_Journey.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class First_Non_Repeating_Letter {
    public static void printNonRepeating(String str){
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        char ch;
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if (q.isEmpty()){
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }

            if (i == str.length()-1){
                System.out.println();
                System.out.println("Letter is :- " + q.peek());
            }
        }

        //If Queue is Empty -> no Unique letter
        if (q.isEmpty()){
            System.out.println("No such Non-repeating letter");
            return;
        }

        //Idx of that character
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == q.peek()){
                System.out.println("Idx of Unique letter is -> "+ i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
//        String str = "aabccxb";
        String str = "leetcode";

        printNonRepeating(str);
    }
}
