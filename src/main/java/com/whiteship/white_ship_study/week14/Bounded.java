package com.whiteship.white_ship_study.week14;

import java.io.*;

public class Bounded {

    public static <T extends Serializable> void write(T object) {
        File file = new File("test.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //write(a);
        write(b);
    }
}

class A {}
class B implements Serializable {}