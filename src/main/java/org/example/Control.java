package org.example;

import org.example.WriterAndReader.FileInformation;
import org.example.WriterAndReader.Reader;
import org.example.WriterAndReader.Writer;

import java.io.IOException;
import java.util.Scanner;

public class Control {
    private String value;

    Control(String value){
        this.value = value;
    }
    public void controlMenu(Scanner scanner) throws IOException {
        switch (value){
            case "запись" :
                System.out.println("Введите платформу, с новый строки логин, пароль(Логин:Пароль)");
                new Writer(scanner.nextLine(),scanner.nextLine());
                break;
            case "спрос" :
                System.out.println("Вывести весь спсиок или конкретную платформу?(команда все либо пишите платформу");
                new Reader(scanner.nextLine());
                break;
            case "стоп" :
                System.out.println("Bye-Bye");
                System.exit(404);
                break;
            default:
                System.out.println("Такой команды нет");
        }
    }
}
