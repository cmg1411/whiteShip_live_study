package com.whiteship.white_ship_study.week13.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/myDir");
        file.mkdir();


        long createdTime = file.lastModified();
        String fileName = file.getName();

        String pattern = "yyyy-MM-dd hh:mm aa";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date lastModifiedDate = new Date( createdTime );

        System.out.println( fileName + " 은 " + simpleDateFormat.format( lastModifiedDate ) + "에 마지막으로 수정되었습니다." );
    }
}
