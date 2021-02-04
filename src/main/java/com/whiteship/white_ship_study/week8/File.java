package com.whiteship.white_ship_study.week8;

public class File implements Openable {
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void print() {

    }

    @Override
    public void write() {
        System.out.println("write");
    }

    public static void main(String[] args) {
        Readable readable = new File();
        // readable.open(); 불가능
        readable.read();
        // readable.write(); 불가능

        Writeable writeable = new File();
        // writeable.open(); 불가능
        // writeable.read(); 불가능
        writeable.write();

        Openable openable = new File();
        openable.open();
        openable.read();
        openable.write();

        File f = new File();
        f.open();
        f.read();
        f.write();
    }
}
