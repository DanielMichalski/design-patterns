package wzorce_zlozone.kaczki.fabryka;

import wzorce_zlozone.kaczki.*;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class FabrykaKaczek extends AbstrakcyjnaFabrykaKaczek {
    @Override
    public Kwaczaca utworzDzikaKaczka() {
        return new DzikaKwaczaca();
    }

    @Override
    public Kwaczaca utworzPlaskonosKaczka() {
        return new PlakonosKwaczaca();
    }

    @Override
    public Kwaczaca utworzWabikKaczka() {
        return new WabikKwaczaca();
    }

    @Override
    public Kwaczaca utworzGumowaKaczka() {
        return new GumowaKwaczaca();
    }
}
