package strategia.kaczki.rodzaje_kaczek;

import strategia.kaczki.zachowania_kaczek.Kwacz;
import strategia.kaczki.zachowania_kaczek.NieLatam;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class ModelKaczki extends Kaczka {
    public ModelKaczki() {
        setLatanieInterface(new NieLatam());
        setKwakanieIterfejs(new Kwacz());
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem modelem strategia.kaczki!");
    }
}
