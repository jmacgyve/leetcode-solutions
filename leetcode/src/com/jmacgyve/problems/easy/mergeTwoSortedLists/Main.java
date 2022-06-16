package com.jmacgyve.problems.easy.mergeTwoSortedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = null;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;
        listNode23.next = null;

        LinkedList<String> linkedList = new LinkedList<>();


        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode resultHead = mergeTwoSortedLists.mergeTwoLists(listNode11, listNode21);
        //todo print
    }
}
