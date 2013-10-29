package strategia.gra_rpg.postacie;

import strategia.gra_rpg.interfejsy.BronZachowanie;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public abstract class Postac {
    BronZachowanie bron;

    public abstract void walcz();

    public void setBron(BronZachowanie bron) {
        this.bron = bron;
    }

    public BronZachowanie getBron() {
        return bron;
    }
}
