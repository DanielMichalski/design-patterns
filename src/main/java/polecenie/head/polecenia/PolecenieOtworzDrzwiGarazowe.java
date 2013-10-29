package polecenie.head.polecenia;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.obiekty.DrzwiGarazowe;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class PolecenieOtworzDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieOtworzDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.wlacz();
    }

    @Override
    public void wycofaj() {
        drzwiGarazowe.wylacz();
    }
}
