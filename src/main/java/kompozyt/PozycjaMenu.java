package kompozyt;

import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class PozycjaMenu extends MenuSkladnik {
    private String nazwa;
    private String opis;
    private boolean czyWegetarianska;
    private double cena;

    public PozycjaMenu(String nazwa,
                       String opis,
                       boolean czyWegetarianska,
                       double cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.czyWegetarianska = czyWegetarianska;
        this.cena = cena;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String getOpis() {
        return opis;
    }

    @Override
    public boolean czyWegetarianska() {
        return czyWegetarianska;
    }

    @Override
    public double getCena() {
        return cena;
    }

    @Override
    public void drukuj() {
        System.out.print("  " + getNazwa());
        if (czyWegetarianska)
            System.out.print("(w)");
        System.out.println(", " + getCena());
        System.out.println("     -- " + getOpis());
    }

    @Override
    public Iterator iterator() {
        return new IteratorPusty();
    }
}
