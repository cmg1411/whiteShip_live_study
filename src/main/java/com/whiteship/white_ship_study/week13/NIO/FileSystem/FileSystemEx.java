package com.whiteship.white_ship_study.week13.NIO.FileSystem;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemEx {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();

        Iterable<FileStore> fileStores = fileSystem.getFileStores();

        for (FileStore fileStore : fileStores) {
            System.out.println("드라이버 명 : " + fileStore.name());
            System.out.println("파일시스템 : " + fileStore.type());
            System.out.println("전체 공간 : " + fileStore.getTotalSpace());
            System.out.println("사용중인 공간 : " + (fileStore.getTotalSpace() - fileStore.getUnallocatedSpace()));
            System.out.println("할당되지 않은 공간 : " + fileStore.getUnallocatedSpace());
            System.out.println("사용가능한 공간 : " + fileStore.getUsableSpace());

        }
    }
}
