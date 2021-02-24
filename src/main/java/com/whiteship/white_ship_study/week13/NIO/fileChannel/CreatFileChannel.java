package com.whiteship.white_ship_study.week13.NIO.fileChannel;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreatFileChannel {
    public static void main(String[] args) {
        try(FileChannel fileChannel = FileChannel.open(
            Paths.get("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/abcd.txt"),
            StandardOpenOption.CREATE_NEW,
            StandardOpenOption.WRITE
        )) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
