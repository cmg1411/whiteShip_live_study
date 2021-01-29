package com.whiteship.white_ship_study.linkedList;

public interface LinkedList {
    ListNode add(ListNode head, ListNode nodeToAdd, int position);
    ListNode remove(ListNode head, int positionToRemove);
    boolean contains(ListNode head, ListNode nodeTocheck);
}
