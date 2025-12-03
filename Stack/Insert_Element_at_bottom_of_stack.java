package My_DSA_Journey.Stack;

import java.util.Stack;

public class Insert_Element_at_bottom_of_stack {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return st;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);

        return st;
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(8);

        Insert_Element_at_bottom_of_stack obj = new Insert_Element_at_bottom_of_stack();

        Stack<Integer> result = obj.insertAtBottom(st,2);
        System.out.println(result);
    }
}
