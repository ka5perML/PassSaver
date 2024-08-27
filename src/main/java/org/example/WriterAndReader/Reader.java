package org.example.WriterAndReader;

import java.io.*;
import java.util.ArrayList;

public class Reader {

    FileReader fr;
    BufferedReader bf;
    String line;
    String command;
    ArrayList<String> message = new ArrayList<>();

    public Reader(String command) throws IOException {
        this.command = command;
        if(command.equals("все")){
            System.out.println(all());
        }else{
            System.out.println(unicl());
        }
    }
    public ArrayList<String> all() throws IOException {
        message.clear();
        try {
            fr = new FileReader(FileInformation.getFile());
            bf = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        line = bf.readLine();
        while (line != null){
            message.add(line);
            line = bf.readLine();
        }
        return message;
    }
    public ArrayList<String> unicl() throws IOException {
        message.clear();
        String[] lines;
        try {
            fr = new FileReader(FileInformation.getFile());
            bf = new BufferedReader(fr);
            line = bf.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (line != null){
            lines = line.split(":");
            if(lines[0].equals(command)){
                message.add(line);
            }
            line = bf.readLine();
            lines = null;
        }
        return message;
    }
}
