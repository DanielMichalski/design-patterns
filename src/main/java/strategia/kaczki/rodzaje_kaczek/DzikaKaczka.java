package strategia.kaczki.rodzaje_kaczek;

import strategia.kaczki.zachowania_kaczek.Kwacz;
import strategia.kaczki.zachowania_kaczek.LatamBoMamSkrzydla;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class DzikaKaczka extends Kaczka {
    public DzikaKaczka() {
        setKwakanieIterfejs(new Kwacz());
        setLatanieInterface(new LatamBoMamSkrzydla());
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem prawdziwą dziką kaczką");
    }
}
