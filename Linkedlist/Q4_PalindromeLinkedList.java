package Linkedlist;

public class Q4_PalindromeLinkedList {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Middle of LinkedList
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

    // Reverse of LinkedList
    static ListNode reverseLL(ListNode head) {
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


    // Separate 2 Linkedlist
    static boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }

        if(head.next == null) {
            return true;
        }

        //  Midpoint
        ListNode list2 = getMidLinkedList(head);

        // List1 and List2 Separate
        ListNode temp = head;

        while(temp.next != list2) {
            temp = temp.next;
        }
        temp.next = null;

        // List2 Reverse
        ListNode head2 = reverseLL(list2);

        // List1 and List2 Compare
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp1 != null && temp2 != null) {
            if(temp1.data != temp2.data) {
                return false;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;
    }

    static void main() {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(10);

        System.out.println(isPalindrome(head));

    }
}
