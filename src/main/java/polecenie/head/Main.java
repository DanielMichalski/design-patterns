package polecenie.head;

import polecenie.head.interfejsy.Polecenie;
import polecenie.head.obiekty.DrzwiGarazowe;
import polecenie.head.obiekty.SuperPilot;
import polecenie.head.obiekty.Swiatlo;
import polecenie.head.polecenia.*;

/**
 * Author: Daniel
 * Date: 06.08.13
 */

public class Main {
    public static void main(String[] args) {
        SuperPilot pilot = new SuperPilot();


        Swiatlo swiatlo = new Swiatlo();
        DrzwiGarazowe drzwiGarazowe = new DrzwiGarazowe();

        PolecenieWlaczSwiatlo wlaczSwiatlo = new PolecenieWlaczSwiatlo(swiatlo);
        PolecenieWylaczSwiatlo wylaczSwiatlo = new PolecenieWylaczSwiatlo(swiatlo);

        PolecenieOtworzDrzwiGarazowe polecenieOtworzDrzwiGarazowe =
                new PolecenieOtworzDrzwiGarazowe(drzwiGarazowe);
        PolecenieZamknijDrzwiGarazowe polecenieZamknijDrzwiGarazowe =
                new PolecenieZamknijDrzwiGarazowe(drzwiGarazowe);

        //pilot.ustawPolecenie(0, wlaczSwiatlo, wylaczSwiatlo);
        //pilot.ustawPolecenie(1, polecenieOtworzDrzwiGarazowe, polecenieZamknijDrzwiGarazowe);

        //System.out.println(pilot);


        Polecenie[] wlaczImpreze = {wlaczSwiatlo, polecenieOtworzDrzwiGarazowe};
        Polecenie[] wylaczImpreze = {wylaczSwiatlo, polecenieZamknijDrzwiGarazowe};

        MakroPolecenie makroWlaczImpreze = new MakroPolecenie(wlaczImpreze);
        MakroPolecenie makroWylaczImpreze = new MakroPolecenie(wylaczImpreze);

        pilot.ustawPolecenie(0, makroWlaczImpreze, makroWylaczImpreze);

        System.out.println(pilot);

        pilot.wcisnietoPrzyciskWlacz(0);
        pilot.wcisnietoPrzyciskWylacz(0);

        pilot.wcisnietoPrzyciskWycofaj();


    }
}
