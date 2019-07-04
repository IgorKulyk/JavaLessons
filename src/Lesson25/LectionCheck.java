package Lesson25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("src/tmp/notes.txt");
             FileOutputStream fos = new FileOutputStream("src/tmp/notes3.txt")) {
            byte[] buffer = new byte[fis.available()];

            System.out.printf("File size: %d bytes \n", fis.available());

            fis.read(buffer, 0, buffer.length);

            for (int i = 0; i < buffer.length; i++) {
                buffer[i] -= (char) 1;
            }

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

