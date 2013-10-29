package adapter.head;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class DzikiIndyk implements Indyk {
    @Override
    public void gulgocz() {
        System.out.println("Gulgulgul");
    }

    @Override
    public void lataj() {
        System.out.println("O rany! Latam!... ale" +
                "tylko na krótkich dystansach!");
    }
}
