package Linkedlist;

public class Q3_RotateLinkedList {

    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode getRotate(ListNode head,int k) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int leng = 1;

        // length
        while(temp.next != null) {
            leng++;
            temp = temp.next;
        }
        // Circular
        temp.next = head;

        k = k % leng;

        temp = head;

        // Break logic
        for(int i = 0; i < leng - k - 1; i++) {
            temp = temp.next;
        }
        ListNode forward = temp.next;
        temp.next = null;

        return forward;
    }

    static void getPrint(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void main() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        int k = 4;

        head = getRotate(head,k);
        System.out.println("After Rotate:-");
        getPrint(head);
    }
}
