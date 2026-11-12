static class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

static boolean detectLoop(ListNode head) {
    if(head == null || head.next == null) {
        return false;
    }

    ListNode slow = head;
    ListNode fast = head;

    while(slow != null && fast != null && fast.next != null) {
        fast = fast.next;
        if(fast != null) {
            fast = fast.next;
        }
        slow = slow.next;

        if(slow == fast) {
            return true;
        }
    }

    return false;
}

void main() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

// Loop create
   head.next.next.next.next.next = head.next.next;

    boolean result = detectLoop(head);
    System.out.println("Loop detected: " + result);
}