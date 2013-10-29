package strategia.kaczki;

import strategia.kaczki.rodzaje_kaczek.DzikaKaczka;
import strategia.kaczki.rodzaje_kaczek.Kaczka;
import strategia.kaczki.rodzaje_kaczek.ModelKaczki;
import strategia.kaczki.zachowania_kaczek.LotZNapedemRakietowym;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class Main {
    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        Kaczka model = new ModelKaczki();
        model.wykonajLec();
        model.setLatanieInterface(new LotZNapedemRakietowym());
        model.wykonajLec();
    }
}
