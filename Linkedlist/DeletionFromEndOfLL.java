
package Linkedlist;

public class DeletionFromEndOfLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode deleteNode(ListNode head, int k) {
        if(head == null || k < 0) {
            return head;
        }
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Convert end position into starting position
        k = length - k + 1;

        // If first node needs to be deleted
        if (k == 1) {
            return head.next;
        }

        temp = head;

        // Reach previous node
        for (int i = 1; i < k - 1; i++) {
            temp = temp.next;
        }

        // Delete kth node
        temp.next = temp.next.next;

        return head;
    }

    static void main() {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int k = 3;

        // Delete kth node
        head = deleteNode(head, k);

        // Print Linked List
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
