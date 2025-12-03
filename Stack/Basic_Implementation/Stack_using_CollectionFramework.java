package My_DSA_Journey.Stack.Basic_Implementation;

import java.util.Stack;

public class Stack_using_CollectionFramework {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println(stack.size());
            stack.pop();
        }
    }
}
