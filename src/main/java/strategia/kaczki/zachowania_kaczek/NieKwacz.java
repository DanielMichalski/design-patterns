package strategia.kaczki.zachowania_kaczek;

import strategia.kaczki.interfejsy.KwakanieIterfejs;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class NieKwacz implements KwakanieIterfejs {
    @Override
    public void kwacz() {
        System.out.println("<<<CISZA>>>");
    }
}
