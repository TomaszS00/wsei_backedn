package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class outputstream {

    public static void main(String[] args) {

        FileOutputStream filestream = null;
        File file;
        String filetxt = "Example of text to be written to the file";
        try {

            file = new File("D:/myfile.txt");
            filestream = new FileOutputStream(file);


            if (!file.exists()) {
                file.createNewFile();
            }


            byte[] bytesArray = filetxt.getBytes();

            filestream.write(bytesArray);
            filestream.flush();
            System.out.println("Success");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            if (filestream != null)
            {
                filestream.close();
            }
        }
        catch (IOException ioe) {
            System.out.println("Failure");
        }



    }
}
