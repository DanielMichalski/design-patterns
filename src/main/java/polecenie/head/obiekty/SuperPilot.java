package polecenie.head.obiekty;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.polecenia.BrakPolecenia;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class SuperPilot {
    private Polecenie[] poleceniaWlacz;
    private Polecenie[] poleceniaWylacz;
    private Polecenie polecenieWycofaj;

    public SuperPilot() {
        poleceniaWlacz = new Polecenie[7];
        poleceniaWylacz = new Polecenie[7];

        BrakPolecenia brakPolecenia = new BrakPolecenia();
        for (int i = 0; i < 7; i++) {
            poleceniaWlacz[i] = brakPolecenia;
            poleceniaWylacz[i] = brakPolecenia;
        }
        polecenieWycofaj = brakPolecenia;
    }

    public void ustawPolecenie(int slot, Polecenie polecenieWlacz, Polecenie polecenieWylacz) {
        poleceniaWlacz[slot] = polecenieWlacz;
        poleceniaWylacz[slot] = polecenieWylacz;
    }

    public void wcisnietoPrzyciskWlacz(int slot) {
        poleceniaWlacz[slot].wykonaj();
        polecenieWycofaj = poleceniaWlacz[slot];
    }

    public void wcisnietoPrzyciskWylacz(int slot) {
        poleceniaWylacz[slot].wykonaj();
        polecenieWycofaj = poleceniaWylacz[slot];
    }

    public void wcisnietoPrzyciskWycofaj() {
        polecenieWycofaj.wycofaj();
    }

    public void powciskajWszystkiePrzyciski() {
        for (int i = 0; i < 7; i++) {
            poleceniaWlacz[i].wykonaj();
            poleceniaWylacz[i].wykonaj();
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------- SuperPilot -------\n");
        for (int i = 0; i < poleceniaWlacz.length; i++) {
            stringBuff.append("[slot " + i + "] " + poleceniaWlacz[i].getClass().getSimpleName() +
                    "\t" + poleceniaWylacz[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
