package dekorator.dekorator2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Main {

    public static final String FILE_NAME = "src/main/java/dekorator/dekorator2/test.txt";

    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(FILE_NAME)));
            while ((c = in.read()) >= 0)
                System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
