package iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class PozycjaMenu {
    private String nazwa;
    private String opis;
    private boolean wegetarianska;
    private double cena;

    public PozycjaMenu(String nazwa, String opis,
                       boolean wegetarianska, double cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.wegetarianska = wegetarianska;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public boolean isWegetarianska() {
        return wegetarianska;
    }

    public double getCena() {
        return cena;
    }
}
