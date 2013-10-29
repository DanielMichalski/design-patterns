package polecenie.head.polecenia;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.obiekty.Swiatlo;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class PolecenieWlaczSwiatlo implements Polecenie {
    private Swiatlo swiatlo;

    public PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wlacz();
    }

    @Override
    public void wycofaj() {
        swiatlo.wylacz();
    }
}
