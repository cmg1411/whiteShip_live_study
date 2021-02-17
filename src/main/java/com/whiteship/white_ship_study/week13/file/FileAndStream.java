package com.whiteship.white_ship_study.week13.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileAndStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/abc.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] b = new byte[5];

            int readData;
            while ((readData = fileInputStream.read(b)) != -1) {
                for (byte data : b) {
                    System.out.print((char) data);
                }
                System.out.println();
            }
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte[] toWrite = "Go".getBytes();
            fileOutputStream.write(toWrite);
        }
    }
}
