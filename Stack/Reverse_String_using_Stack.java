package My_DSA_Journey.Stack;

import java.util.Stack;

public class Reverse_String_using_Stack {
    public String reverse(String S) {

        int n = S.length();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++){
            st.push(S.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        Reverse_String_using_Stack obj = new Reverse_String_using_Stack();

        String s1 = "GeeksforGeeks";
        String s2 = "Geek";

        System.out.println(obj.reverse(s1));  // Output: skeeGrofskeeG
        System.out.println(obj.reverse(s2));  // Output: keeG
    }
}
