package com.dsa.inter.ril;

public class HasCycle {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        System.out.println(hasCycle(node));
    }

    private static boolean hasCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (node != null && node.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast.next == slow.next) return true;
        }
        return false;
    }
}
