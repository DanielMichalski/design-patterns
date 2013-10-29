package polecenie.head.obiekty;

import polecenie.head.interfejsy.AkcjaWlacz;
import polecenie.head.interfejsy.AkcjaWylacz;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class DrzwiGarazowe implements AkcjaWlacz, AkcjaWylacz {
    @Override
    public void wlacz() {
        System.out.println("Drzwi garażowe zostały otworzone");
    }

    @Override
    public void wylacz() {
        System.out.println("Drzwi garażowe zostały wyłączone");
    }
}
