package com.whiteship.white_ship_study.week14;

import java.time.chrono.Era;
import java.util.ArrayList;
import java.util.List;

public class Erasure<T> {

    private List<T> list;

    public void setList() {
        list = new ArrayList<>();
    }

    public <R> List<R> get(List<R> item) {
        if (item.equals(list)) return item;
        else return null;
    }

    public static void main(String[] args) {
        Erasure<String> str = new Erasure<>();
        str.setList();
        str.get(new ArrayList<Integer>());
    }
}
