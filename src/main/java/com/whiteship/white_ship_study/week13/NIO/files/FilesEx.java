package com.whiteship.white_ship_study.week13.NIO.files;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/abc.txt");

        System.out.println("디렉토리 여부 : " + Files.isDirectory(path));
        System.out.println("파일 여부 : " + Files.isRegularFile(path));
        System.out.println("마지막 수정 시간 : " + Files.getLastModifiedTime(path));
        System.out.println("파일 크기 : " + Files.size(path));
        System.out.println("소유자 : " + Files.getOwner(path).getName());
        System.out.println("숨김 파일 여부 : " + Files.isHidden(path));
    }
}
