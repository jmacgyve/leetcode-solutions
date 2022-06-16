package com.jmacgyve.problems.easy.removeLinkedListElements;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current_list = head;
        while (current_list != null && current_list.next != null) {
            if (current_list.next.val == val) {
                current_list.next = current_list.next.next;
            } else {
                current_list = current_list.next;
            }
        }
        return head;
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
