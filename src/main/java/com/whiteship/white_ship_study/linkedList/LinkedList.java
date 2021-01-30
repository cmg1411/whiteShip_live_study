package com.whiteship.white_ship_study.linkedList;

public interface LinkedList {
    ListNode add(ListNode nodeToAdd, int position);
    ListNode remove(int positionToRemove);
    boolean contains(ListNode nodeToCheck);
}
