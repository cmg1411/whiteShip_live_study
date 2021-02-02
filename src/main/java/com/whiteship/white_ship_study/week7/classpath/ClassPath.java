package com.whiteship.white_ship_study.week7.classpath;

class ClassPath {
    public static void main(String[] args) {
        String strClassPath = System.getProperty("java.class.path");
        System.out.println(strClassPath);
    }
}
