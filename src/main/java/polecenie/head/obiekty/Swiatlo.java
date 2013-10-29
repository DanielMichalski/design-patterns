package polecenie.head.obiekty;

import polecenie.head.interfejsy.AkcjaWlacz;
import polecenie.head.interfejsy.AkcjaWylacz;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class Swiatlo implements AkcjaWlacz, AkcjaWylacz {
    public void wlacz() {
        System.out.println("Świtatło zostało włączone!");
    }

    @Override
    public void wylacz() {
        System.out.println("Światło zostało wylączone");
    }
}
