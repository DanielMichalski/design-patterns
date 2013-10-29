package wzorce_zlozone.kaczki.fabryka;

import wzorce_zlozone.kaczki.*;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class FabrykaKaczekZLicznikiem extends AbstrakcyjnaFabrykaKaczek {
    @Override
    public Kwaczaca utworzDzikaKaczka() {
        return new KwakLicznik(new DzikaKwaczaca());
    }

    @Override
    public Kwaczaca utworzPlaskonosKaczka() {
        return new KwakLicznik(new PlakonosKwaczaca());
    }

    @Override
    public Kwaczaca utworzWabikKaczka() {
        return new KwakLicznik(new WabikKwaczaca());
    }

    @Override
    public Kwaczaca utworzGumowaKaczka() {
        return new KwakLicznik(new GumowaKwaczaca());
    }
}
