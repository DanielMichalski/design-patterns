package polecenie.head.polecenia;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.obiekty.Swiatlo;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class PolecenieWylaczSwiatlo implements Polecenie {
    private Swiatlo swiatlo;

    public PolecenieWylaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wylacz();
    }

    @Override
    public void wycofaj() {
        swiatlo.wlacz();
    }
}
