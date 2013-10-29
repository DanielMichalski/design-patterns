package metoda_szablonowa.napoje;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class Kawa extends NapojZKofeina {
    @Override
    public void zaparzanie() {
        System.out.println("Zaparzanie i przesączanie kawy przez filtr");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println("Dodawanie cukru i mleka do smaku");
    }
}
