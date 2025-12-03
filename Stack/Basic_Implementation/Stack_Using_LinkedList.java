package My_DSA_Journey.Stack.Basic_Implementation;

public class Stack_Using_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);

            if (isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop(){
            if (isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

        //print
        public void print(){
            if (isEmpty()){
                System.out.println("Stack is Empty!");
                return;
            }

            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + "-> ");
                temp = temp.next;
                if (temp == null){
                    System.out.println("null");
                }
            }
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        s.print();
        System.out.println(s.pop());
        s.print();
    }
}
