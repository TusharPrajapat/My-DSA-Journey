package My_DSA_Journey.LinkedList.Medium;

import java.util.LinkedList;

public class remove_nth_node_from_end {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; //ByDefault java initialize it's value 0



    public Node removeNthFromEnd(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(n == size){
            return head.next;
        }

        int indexToFind = size -n;
        Node prev = head;
        for(int i = 1; i < indexToFind; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    public void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        remove_nth_node_from_end obj = new remove_nth_node_from_end();
        Node newHead = obj.removeNthFromEnd(head, 2);
        obj.printList(newHead);
    }
}
