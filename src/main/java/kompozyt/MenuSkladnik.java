package kompozyt;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public abstract class MenuSkladnik implements Iterable {
    public void dodaj(MenuSkladnik menuSkladnik) {
        throw new UnsupportedOperationException();
    }

    public void unun(MenuSkladnik menuSkladnik) {
        throw new UnsupportedOperationException();
    }

    public MenuSkladnik pobierzPotomek(int i) {
        throw new UnsupportedOperationException();
    }


    public String getNazwa() {
        throw new UnsupportedOperationException();
    }

    public String getOpis() {
        throw new UnsupportedOperationException();
    }

    public double getCena() {
        throw new UnsupportedOperationException();
    }

    public boolean czyWegetarianska() {
        throw new UnsupportedOperationException();
    }

    public void drukuj() {
        throw new UnsupportedOperationException();
    }
}
