package polecenie.head.polecenia;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.obiekty.DrzwiGarazowe;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class PolecenieZamknijDrzwiGarazowe implements Polecenie {
    private DrzwiGarazowe drzwiGarazowe;

    public PolecenieZamknijDrzwiGarazowe(DrzwiGarazowe drzwiGarazowe) {
        this.drzwiGarazowe = drzwiGarazowe;
    }

    @Override
    public void wykonaj() {
        drzwiGarazowe.wylacz();
    }

    @Override
    public void wycofaj() {
        drzwiGarazowe.wlacz();
    }
}
