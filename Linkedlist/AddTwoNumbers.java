package Linkedlist;

public class AddTwoNumbers {

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

    static void main() {
        ListNode headA = new ListNode(2);
        headA.next = new ListNode(4);

        ListNode headB = new ListNode(6);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(1);

        headA = getReverse(headA);
        headB = getReverse(headB);
    }
}
