package My_DSA_Journey.Queue.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_2_Queue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            //if q1 is not Empty
            // q1 --> q2
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }

            //if q1 is empty then add in q1
            q1.add(data);

            //if q2 is not empty
            //q2 --> q1
            while (!q2.isEmpty()){
                q1.add(q2.peek());
                q2.remove();
            }
        }

        public static int pop(){
            if (isEmpty()){
                System.out.println("Stack is Empty()!");
                return -1;
            }

            return q1.remove();
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Stack is Empty()!");
                return -1;
            }

            return q1.peek();
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
