package com.jmacgyve.problems.easy.reverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }

        ListNode buff = head.next;
        head.next = newHead;
        newHead = head;
        head = buff;

        return reverse(head, newHead);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
