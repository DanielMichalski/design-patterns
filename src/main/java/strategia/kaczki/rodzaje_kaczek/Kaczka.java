package strategia.kaczki.rodzaje_kaczek;

import strategia.kaczki.interfejsy.KwakanieIterfejs;
import strategia.kaczki.interfejsy.LatanieInterface;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public abstract class Kaczka {
    private LatanieInterface latanieInterface;
    private KwakanieIterfejs kwakanieIterfejs;

    public abstract void wyswietl();

    public void wykonajLec() {
        latanieInterface.lec();
    }

    public void wykonajKwacz() {
        kwakanieIterfejs.kwacz();
    }

    public void plywaj() {
        System.out.println("Wszystkie strategia.kaczki pływają, nawet te sztuczne");
    }

    public void setLatanieInterface(LatanieInterface latanieInterface) {
        this.latanieInterface = latanieInterface;
    }

    public void setKwakanieIterfejs(KwakanieIterfejs kwakanieIterfejs) {
        this.kwakanieIterfejs = kwakanieIterfejs;
    }
}
