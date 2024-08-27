package org.example;

import org.example.WriterAndReader.*;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileStatus fileStatus = new FileStatus();
        String command;
        while (true){
            System.out.println(FileInformation.getInfo());
            command = scanner.nextLine();
            Control control = new Control(command);
            control.controlMenu(scanner);
        }
    }

}