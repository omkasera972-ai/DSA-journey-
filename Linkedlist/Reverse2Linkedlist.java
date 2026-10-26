package Linkedlist;

// Add two numbers represented by linked lists:=

public class Reverse2Linkedlist {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode getReverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    static void printList(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void main() {
        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);

        ListNode headB = new ListNode(30);
        headB.next = new ListNode(40);
        headB.next.next = new ListNode(50);

        headA = getReverse(headA);
        headB = getReverse(headB);

        System.out.println("List A");
        printList(headA);

        IO.println("~~~~~~~~~~~");
        System.out.println("List B");
        printList(headB);
    }
}
