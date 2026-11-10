static class ListNode{
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

static ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }

    ListNode oddHead = head;
    ListNode oddTail = head;
    ListNode evenHead = head.next;
    ListNode evenTail = head.next;

    while(evenTail != null && evenTail.next != null) {
        oddTail.next = evenTail.next;
        oddTail = evenTail.next;

        evenTail.next = oddTail.next;
        evenTail = oddTail.next;
    }

    oddTail.next = evenHead;

    return head;
}

void main() {
    ListNode head = new ListNode(10);
    head.next = new ListNode(20);
    head.next.next = new ListNode(30);
    head.next.next.next = new ListNode(40);
    head.next.next.next.next = new ListNode(50);

    head = oddEvenList(head);

    ListNode temp = head;

    while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}