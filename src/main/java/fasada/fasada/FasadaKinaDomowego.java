package fasada.fasada;

import fasada.urzadzenia.*;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class FasadaKinaDomowego {
    private Wzmacniacz wzmacniacz;
    private Tuner tuner;
    private OdtwarzaczDVD odtwarzaczDVD;
    private OdtwarzaczCD odtwarzaczCD;
    private Projektor projektor;
    private OswietlenieKinowe oswietlenieKinowe;
    private Ekran ekran;
    private MaszynkaPopkorn maszynkaPopkorn;

    public FasadaKinaDomowego(Wzmacniacz wzmacniacz, Tuner tuner,
                              OdtwarzaczDVD odtwarzaczDVD, OdtwarzaczCD odtwarzaczCD,
                              Projektor projektor, OswietlenieKinowe oswietlenieKinowe,
                              Ekran ekran, MaszynkaPopkorn maszynkaPopkorn) {
        this.wzmacniacz = wzmacniacz;
        this.tuner = tuner;
        this.odtwarzaczDVD = odtwarzaczDVD;
        this.odtwarzaczCD = odtwarzaczCD;
        this.projektor = projektor;
        this.oswietlenieKinowe = oswietlenieKinowe;
        this.ekran = ekran;
        this.maszynkaPopkorn = maszynkaPopkorn;
    }

    public void odtwarzanieFilmu(String film) {
        System.out.println("--------- Przygotuj się na seans filmowy ---------");
        maszynkaPopkorn.wlacz();
        maszynkaPopkorn.przygotujPopkorn();
        oswietlenieKinowe.sciemniaj(10);
        ekran.wDol();
        projektor.wlacz();
        projektor.trybSzerokoekranowy();
        wzmacniacz.wlacz();
        wzmacniacz.ustawDVD(odtwarzaczDVD);
        wzmacniacz.ustawDzwiekPrzestrzenny();
        wzmacniacz.ustawGlosnosc(5);
        odtwarzaczDVD.wlacz();
        odtwarzaczDVD.odtwarzaj(film);
    }

    public void koniecFilmu() {
        System.out.println("\n--------- Koniec seansu, wyłączam kono domowe ---------");
        maszynkaPopkorn.wylacz();
        oswietlenieKinowe.wlacz();
        ekran.wGore();
        projektor.wylacz();
        wzmacniacz.wylacz();
        odtwarzaczDVD.zatrzymaj();
        odtwarzaczDVD.wysunDysk();
        odtwarzaczDVD.wylacz();

    }
}
