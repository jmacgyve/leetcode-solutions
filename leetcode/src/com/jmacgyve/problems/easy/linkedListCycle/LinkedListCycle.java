package com.jmacgyve.problems.easy.linkedListCycle;

public class LinkedListCycle {
    //решение через указатели, но можно тупо брутфорсом (через Set<ListNode> nodesSeen = new HashSet<>())
    public boolean hasCycle(ListNode head) {
        if (head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next; //перепрыгиваем через один
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
