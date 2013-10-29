package fasada.urzadzenia;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class OdtwarzaczDVD {
    private String film = "";

    public void wlacz() {
        System.out.println("Odtwarzacz DVD: wlączony");
    }

    public void odtwarzaj(String film) {
        this.film = film;
        System.out.println("Odtwarzacz DVD: odtwarzanie filmu \"" + film + "\"");
    }

    public void zatrzymaj() {
        System.out.println("Odtwarzacz DVD: koniec odtwarzania filmu \"" + film + "\"");
    }

    public void wysunDysk() {
        System.out.println("Odtwarzacz DVD: wysuwanie dystku DVD");
    }

    public void wylacz() {
        System.out.println("Odtwarzacz DVD: wyłączony");
    }
}
