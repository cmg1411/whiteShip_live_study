package com.whiteship.white_ship_study.week14;

public class MultiTypeParameter<K, V> {
    private final K studentNumber;
    private final V name;

    public MultiTypeParameter(K studentNumber, V name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    private K getStudentNumber() {
        return studentNumber;
    }

    public V getName() {
        return name;
    }

    public static void main(String[] args) {
        MultiTypeParameter<Integer, String> student = new MultiTypeParameter<>(12, "mingeor");
        System.out.println(student.getName());
    }
}
