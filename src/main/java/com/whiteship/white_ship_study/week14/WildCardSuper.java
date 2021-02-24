package com.whiteship.white_ship_study.week14;

import java.util.ArrayList;
import java.util.List;

public class WildCardSuper<E> {

    private final List<E> sockets;

    public WildCardSuper() {
        this.sockets = new ArrayList<>();
    }

    public void putItems(E object) {
        sockets.add(object);
    }

    public List<? super E> getNewItemList(List<? super E> list) {
        list.addAll(sockets);
        return list;
    }

    public static void main(String[] args) {
        WildCardSuper<String> str = new WildCardSuper<>();
        str.putItems("hi");
        str.putItems("bye");

        List<Object> objectList = new ArrayList<>();

        System.out.println(str.getNewItemList(objectList));
    }
}