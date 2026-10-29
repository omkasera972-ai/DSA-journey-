package Linkedlist;

public class MiddleOfLinkedList {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode getMidLinkedList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    static void main() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        ListNode mid = getMidLinkedList(head);
        System.out.print("Middle of LinkedList:- " + mid.data);
    }
}
