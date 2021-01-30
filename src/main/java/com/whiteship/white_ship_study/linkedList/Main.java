package com.whiteship.white_ship_study.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();

        for (int i = 0; i < 10; i++){
            list.add(new ListNode(i), i);
        }

        list.remove(1);
        list.remove(5);

        list.printList();

        ListNode existNode = new ListNode(2);
        ListNode nonExistNode = new ListNode(11);
        System.out.println();
        System.out.println(list.contains(existNode));
        System.out.println(list.contains(nonExistNode));
    }
}
