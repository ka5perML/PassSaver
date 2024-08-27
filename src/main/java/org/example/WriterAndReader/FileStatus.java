package org.example.WriterAndReader;

import java.io.File;
import java.io.IOException;

public class FileStatus {
    public FileStatus(){
        checker();
    }
    public void checker(){
        try {
            if(FileInformation.getFile().createNewFile()){
                System.out.println("Файл создан");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }
        System.out.println("Файл подгружен");
    }
}
