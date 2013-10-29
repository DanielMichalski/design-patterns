package metoda_szablonowa.napoje;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class Herbata extends NapojZKofeina {
    @Override
    public void zaparzanie() {
        System.out.println("Wkładanie torebki hebaty do wrzątku");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println("Dodawanie cytryny");
    }
}
