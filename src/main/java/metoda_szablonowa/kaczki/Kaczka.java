package metoda_szablonowa.kaczki;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class Kaczka implements Comparable {
    private String nazwa;
    private int waga;

    public Kaczka(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    @Override
    public int compareTo(Object o) {
        Kaczka innaKaczka = (Kaczka) o;

        if (this.waga < innaKaczka.waga)
            return -1;
        else if (this.waga == innaKaczka.waga)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Kwaczaca{" +
                "nazwa='" + nazwa + '\'' +
                ", waga=" + waga +
                "} " + super.toString();
    }
}
