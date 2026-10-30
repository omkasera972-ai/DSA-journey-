package Linkedlist;

public class Q1_Intersect2Linkedlist {
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while(a != null && b != null) {
            a = a.next;
            b = b.next;
        }

        if(a == null) {
            int bExtraLen = 0;

            while(b != null) {
                bExtraLen++;
                b = b.next;
            }

            while(bExtraLen-- > 0) {
                headB = headB.next;
            }
        } else {
            int aExtraLen = 0;

            while(a != null) {
                aExtraLen++;
                a = a.next;
            }

            while(aExtraLen-- > 0) {
                headA = headA.next;
            }
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

        static class ListNode {
            int data;
            ListNode next;

            ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

    static void main() {
        ListNode common = new ListNode(30);
        common.next = new ListNode(40);

        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = common;

        ListNode result = getIntersectionNode(headA,headB);

        if(result != null) {
            System.out.println("Intersection point:- " + result.data);
        } else {
            System.out.println("No Intersection point!!");
        }
    }
}
