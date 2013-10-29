package adapter.head;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();

        DzikiIndyk indyk = new DzikiIndyk();
        Kaczka indykAdapter = new IndykAdapter(indyk);

        System.out.println("----- Indyk powiada tak -----");
        indyk.gulgocz();
        indyk.lataj();

        System.out.println("----- Kwaczaca powiada tak -----");
        testujKaczke(kaczka);

        System.out.println("----- A indyk powiada tak -----");
        testujKaczke(indykAdapter);
    }

    public static void testujKaczke(Kaczka kaczka) {
        kaczka.kwacz();
        kaczka.lataj();
    }
}
