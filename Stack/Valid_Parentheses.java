package My_DSA_Journey.Stack;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if (curr == '(' || curr == '[' || curr == '{'){
                st.push(s.charAt(i));
            }
            else {
                if (st.isEmpty()){
                    return false;
                }

                else if (st.peek() == '(' && curr == ')' || st.peek() == '[' && curr == ']' || st.peek() == '{' && curr == '}'){
                    st.pop();
                }

                else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args){
        String s = "()[]{}";
//        String s = "([)]";
        System.out.println(isValid(s));
    }
}
