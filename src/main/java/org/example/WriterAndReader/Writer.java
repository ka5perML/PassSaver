package org.example.WriterAndReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String platforma;
    private String pass;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    public Writer(String platforma, String pass) {
        this.platforma = platforma;
        this.pass = pass;
        writed();
    }

    public void writed() {
        try {
            if (!FileInformation.getFile().exists()) {
                FileInformation.getFile().createNewFile();
            }

            fileWriter = new FileWriter(FileInformation.getFile(),true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(platforma + ":" + pass + "\n");
            bufferedWriter.close();
            System.out.println("Успешно");
        } catch(IOException e){
            System.out.println("Warning");
        }
    }
}
