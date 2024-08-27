package org.example.WriterAndReader;

import java.io.File;

public class FileInformation {
    private static String fileName = "PASSLIST.txt";

    private static String info = "Введите запись|спрос|стоп";
    private static File file = new File(fileName);
    public static String getFileName() {
        return fileName;
    }

    public static String getInfo() {
        return info;
    }

    public static File getFile() {
        return file;
    }
}
