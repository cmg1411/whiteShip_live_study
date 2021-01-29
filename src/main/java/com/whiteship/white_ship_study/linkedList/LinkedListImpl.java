package com.whiteship.white_ship_study.linkedList;

import java.util.List;

public class LinkedListImpl implements LinkedList {
    private ListNode head;
    @Override
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (position == 0) {
            nodeToAdd.setNextNode(head);
            return head;
        }
        for (int i = 0; i < position - 1; i++) {
            head = head.getNextNode();
        }
        nodeToAdd.setNextNode(head);
        return null;
    }

    @Override
    public ListNode remove(ListNode head, int positionToRemove) {
        return null;
    }

    @Override
    public boolean contains(ListNode head, ListNode nodeTocheck) {
        return false;
    }
}
