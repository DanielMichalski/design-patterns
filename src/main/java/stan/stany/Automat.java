package stan.stany;

import stan.stany.*;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class Automat {
    private Stan stanBrakGum;
    private Stan stanNieMaMonety;
    private Stan stanJestMoneta;
    private Stan stanGumaSprzedana;
    private Stan stanWygrana;

    private Stan stan = stanBrakGum;
    int liczba = 0;

    public Automat(int liczbaGum) {
        stanBrakGum = new StanBrakGum(this);
        stanNieMaMonety = new StanNieMaMonety(this);
        stanJestMoneta = new StanJestMoneta(this);
        stanGumaSprzedana = new StanGumaSprzedana(this);
        stanWygrana = new StanWygrana(this);

        this.liczba = liczbaGum;
        if (liczbaGum > 0)
            stan = stanNieMaMonety;
        else
            stan = stanBrakGum;
    }

    public void wrzucMonete() {
        stan.wlozMonete();
    }

    public void zwrocMonete() {
        stan.zwrocMonete();
    }

    public void przekrecGalke() {
        stan.przekrecGalke();
        stan.wydaj();
    }

    void ustawStan(Stan stan) {
        this.stan = stan;
    }

    void zwolnijGume() {
        System.out.println("Wypada guma...");
        if (liczba != 0)
            liczba--;
    }

    public Stan getStanBrakGum() {
        return stanBrakGum;
    }

    public Stan getStanNieMaMonety() {
        return stanNieMaMonety;
    }

    public Stan getStanJestMoneta() {
        return stanJestMoneta;
    }

    public Stan getStanGumaSprzedana() {
        return stanGumaSprzedana;
    }

    public Stan getStanWygrana() {
        return stanWygrana;
    }

    public int getLiczba() {
        return liczba;
    }

    @Override
    public String toString() {
        return "Automat{" +
                ", liczba=" + liczba +
                "} ";
    }
}
