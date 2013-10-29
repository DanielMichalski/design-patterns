package fasada.urzadzenia;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class Wzmacniacz {
    public void wlacz() {
        System.out.println("Wzmacniacz: włączony");
    }

    public void ustawDVD(OdtwarzaczDVD odtwarzaczDVD) {
        System.out.println("Wzmacniacz: wejście ustawiono odtwarzacz DVD");
    }

    public void ustawDzwiekPrzestrzenny() {
        System.out.println("Wzmacniacz: włączono dźwięk przestrzenny (5 głośników, 1 subwoofer)");
    }

    public void ustawGlosnosc(int i) {
        System.out.println("Wzmacniacz: siła głosu ustawiono na wartość " + i);
    }

    public void wylacz() {
        System.out.println("Wzmacniacz wyłączony");
    }
}
