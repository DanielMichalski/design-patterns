package metoda_szablonowa.napoje;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public abstract class NapojZKofeina {
    final void recepturaParzenia() {
        gotowanieWody();
        zaparzanie();
        nalewanieDoFilizanki();
        if (czyKlientChceDodatki())
            domieszanieDodatkow();
    }

    public abstract void zaparzanie();

    public abstract void domieszanieDodatkow();

    public void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }

    public void nalewanieDoFilizanki() {
        System.out.println("Nalewanie do filizanki");
    }

    public boolean czyKlientChceDodatki() {
        return true;
    }
}
