package com.whiteship.white_ship_study.week13.IO.standardio;

import java.io.*;

public class StandardIO {
    public static void main(String[] args) {
        try (FileOutputStream fo = new FileOutputStream("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {

            PrintStream ps = new PrintStream(new BufferedOutputStream(fo, 128), true);

            System.out.println("Tomas loves Cristin.");
            System.err.println("Cristin also loves Tomas .");

            System.setOut(ps);
            System.setErr(ps);

            System.out.println("Tomas loves Cristin.");
            System.err.println("Cristin also loves Tomas .");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
