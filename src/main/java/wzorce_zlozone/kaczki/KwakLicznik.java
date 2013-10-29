package wzorce_zlozone.kaczki;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class KwakLicznik implements Kwaczaca {
    private Kwaczaca kaczka;
    private static int liczbaKwakniec;

    public KwakLicznik(Kwaczaca kaczka) {
        this.kaczka = kaczka;
    }

    @Override
    public void kwacz() {
        kaczka.kwacz();
        liczbaKwakniec++;
    }

    public static int getLiczbaKwakniec() {
        return liczbaKwakniec;
    }
}
