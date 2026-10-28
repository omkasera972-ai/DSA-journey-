package Linkedlist;

public class CircularLL {

    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void getLengthNCircular(ListNode head) {
        ListNode temp = head;
        int length = 1;

        while(temp.next != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("Length: " + length);
        temp.next = head;
    }

    static void main() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        getLengthNCircular(head);
    }
}

/*

-- Only find length--

int length = 0;
Node temp = head;

while (temp != null) {
    length++;
    temp = temp.next;
}

System.out.println("Length: " + length);

-- Make LL Circular

Node temp = head;

while (temp.next != null) {
    temp = temp.next;
}

temp.next = head;

*/
