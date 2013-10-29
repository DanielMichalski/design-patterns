package wzorce_zlozone.kaczki.fabryka;

import wzorce_zlozone.kaczki.Kwaczaca;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public abstract class AbstrakcyjnaFabrykaKaczek {
    public abstract Kwaczaca utworzDzikaKaczka();
    public abstract Kwaczaca utworzPlaskonosKaczka();
    public abstract Kwaczaca utworzWabikKaczka();
    public abstract Kwaczaca utworzGumowaKaczka();
}
