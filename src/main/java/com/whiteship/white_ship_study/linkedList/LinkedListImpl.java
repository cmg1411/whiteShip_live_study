package com.whiteship.white_ship_study.linkedList;

public class LinkedListImpl implements LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size = 0;

    @Override
    public ListNode add(ListNode nodeToAdd, int position) {
        if (head == null) {
            head = nodeToAdd;
            size++;
            return head;
        }
        if (position == 0) {
            nodeToAdd.setNextNode(head);
            this.size++;
            return head;
        }
        ListNode frontNode = findNode(position);
        ListNode backNode = frontNode.getNextNode();
        frontNode.setNextNode(nodeToAdd);
        nodeToAdd.setNextNode(backNode);
        this.size++;
        if (nodeToAdd.getNextNode() == null) {
            this.tail = nodeToAdd;
        }
        return head;
    }

    @Override
    public ListNode remove(int positionToRemove) {
        if (positionToRemove == 0) {
            this.head = head.getNextNode();
            size--;
            return head;
        }
        ListNode frontNodeToDelete = findNode(positionToRemove);
        ListNode NodeToDelete = frontNodeToDelete.getNextNode();
        frontNodeToDelete.setNextNode(NodeToDelete.getNextNode());
        size--;
        if (NodeToDelete == null) {
            this.tail = frontNodeToDelete;
        }
        return head;
    }

    @Override
    public boolean contains(ListNode nodeToCheck) {
        ListNode node = head;
        for (int i = 0; i < size; i++) {
            if (node.getData() == nodeToCheck.getData()) {
                return true;
            }
            node = node.getNextNode();
        }
        return false;
    }

    private ListNode findNode(int position) {
        ListNode pointer = head;
        for (int i = 0; i < position - 1; i++) {
            pointer = pointer.getNextNode();
        }
        return pointer;
    }

    public void printList() {
        ListNode node = head;
        System.out.print("[ ");
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNextNode();
        }
        System.out.print("]");
    }
}
