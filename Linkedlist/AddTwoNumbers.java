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

    // Reverse linked list
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

    // Add two numbers
    static ListNode addTwoNumbers(ListNode headA, ListNode headB) {

        // Step 1: Reverse both lists
        headA = getReverse(headA);
        headB = getReverse(headB);

        // Step 2: Create answer list
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        // Step 3: Add digits
        while (headA != null || headB != null || carry != 0) {

            int sum = carry;

            if (headA != null) {
                sum = sum + headA.data;
                headA = headA.next;
            }

            if (headB != null) {
                sum = sum + headB.data;
                headB = headB.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            temp.next = new ListNode(digit);
            temp = temp.next;
        }

        // Step 4: Reverse answer
        return getReverse(dummy.next);
    }

    // Print linked list
    static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static void main() {

        ListNode headA = new ListNode(2);
        headA.next = new ListNode(4);

        ListNode headB = new ListNode(6);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(1);

        ListNode result = addTwoNumbers(headA, headB);

        System.out.print("Answer: ");
        printList(result);
    }
}