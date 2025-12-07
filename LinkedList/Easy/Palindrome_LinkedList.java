package My_DSA_Journey.LinkedList.Easy;

import Sigma.Ch28_29_LinkedList.Palindrome_LL;

public class Palindrome_LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isPalindrome(Node head) {
        // code here
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMid(head);

        //Reverse
        Node right = reverse(mid);
        Node left = head;

        while (left != null && right != null) {
            if (left.data == right.data) {
                left = left.next;
                right = right.next;
            } else {
                return false;
            }
        }

        return true;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        return slow;
    }

    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Palindrome_LinkedList list = new Palindrome_LinkedList();

        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(2);
        head.next.next.next.next = list.new Node(1);

        boolean result = list.isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}
