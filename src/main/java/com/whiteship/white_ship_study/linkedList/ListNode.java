package com.whiteship.white_ship_study.linkedList;

public class ListNode {
    private Object data;
    private ListNode nextNode = null;

    public ListNode(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
}
