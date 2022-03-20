package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileInputStream file = null;

        try
        {
            file = new FileInputStream("C:\\Users\\tomek\\OneDrive\\Dokumenty\\xxx.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ERROR - File not found");
            System.exit(1);
        }

        int bytes = 0;

        try
        {
            bytes = file.read();
            while(bytes != -1)
            {
                System.out.print((char)bytes);
                bytes = file.read();
            }
        }
        catch (IOException e)
        {
            System.out.println("ERROR - issue in reading file");
            System.exit(2);
        }

        try
        {
            file.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
