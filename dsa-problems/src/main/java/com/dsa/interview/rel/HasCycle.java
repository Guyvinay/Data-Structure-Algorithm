package com.dsa.interview.rel;

public class HasCycle {
    public static void main(String[] args) {
        // Creating nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        // Connecting nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Creating cycle
        n5.next = n3;  // cycle here

        // Head of list
        ListNode head = n1;

//        System.out.println(hasCycle(head));
        System.out.println(detectCycle(head));
    }

    private static boolean hasCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }

    private static ListNode detectCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) hasCycle = true;
        }

        if (!hasCycle) return null;

        slow = node;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
