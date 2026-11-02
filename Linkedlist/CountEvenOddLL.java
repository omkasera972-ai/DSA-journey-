package Linkedlist;

public class CountEvenOddLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void countEvenOdd(ListNode head) {
        int even = 0;
        int odd = 0;

        ListNode temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            temp = temp.next;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    static void main() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(15);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(25);
        head.next.next.next.next = new ListNode(30);
        head.next.next.next.next.next = new ListNode(35);

        countEvenOdd(head);
    }
}
