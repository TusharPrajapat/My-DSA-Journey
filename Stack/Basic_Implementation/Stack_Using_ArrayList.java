package My_DSA_Journey.Stack.Basic_Implementation;

import java.util.ArrayList;

public class Stack_Using_ArrayList {
    static int size = 0;
    static class Stack{
        //ArrayList in Java is 0-indexing based
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0; // or list.isEmpty();
        }

        //push
        public void push(int data){
            list.add(data);
            size++;
            System.out.println("List.size() -> "+list.size());
        }

        //pop
        public int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.getLast();
            list.remove(list.size()-1); // or list.removeLast();
            size--;
            return top;
        }

        //peek
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            int peek = list.getLast();
            return peek;
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        System.out.println(size);
        System.out.println("Last -> " + s.pop());
        System.out.println(size);
        System.out.println(s.peek());
    }
}
