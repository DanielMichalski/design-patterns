package fasada;

import fasada.fasada.FasadaKinaDomowego;
import fasada.urzadzenia.*;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class Main {
    public static void main(String[] args) {
        Wzmacniacz wzmacniacz = new Wzmacniacz();
        Tuner tuner = new Tuner();
        OdtwarzaczDVD odtwarzaczDVD = new OdtwarzaczDVD();
        OdtwarzaczCD odtwarzaczCD = new OdtwarzaczCD();
        Projektor projektor = new Projektor();
        OswietlenieKinowe oswietlenieKinowe = new OswietlenieKinowe();
        Ekran ekran = new Ekran();
        MaszynkaPopkorn maszynkaPopkorn = new MaszynkaPopkorn();

        FasadaKinaDomowego kinoDomowe =
                new FasadaKinaDomowego(
                        wzmacniacz,
                        tuner,
                        odtwarzaczDVD,
                        odtwarzaczCD,
                        projektor,
                        oswietlenieKinowe,
                        ekran,
                        maszynkaPopkorn);

        kinoDomowe.odtwarzanieFilmu("Poszukiwacze zaginionej arki");
        kinoDomowe.koniecFilmu();
    }


}
