package polecenie.head.polecenia;

import polecenie.head.interfejsy.Polecenie;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class MakroPolecenie implements Polecenie {
    private Polecenie[] polecenia;

    public MakroPolecenie(Polecenie[] polecenia) {
        this.polecenia = polecenia;
    }

    @Override
    public void wykonaj() {
        for (int i = 0; i < polecenia.length; i++) {
            polecenia[i].wykonaj();
        }
    }

    @Override
    public void wycofaj() {
        for (int i = 0; i < polecenia.length; i++) {
            polecenia[i].wycofaj();
        }
    }
}
