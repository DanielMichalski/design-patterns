package wzorce_zlozone;

import wzorce_zlozone.kaczki.*;
import wzorce_zlozone.kaczki.fabryka.AbstrakcyjnaFabrykaKaczek;
import wzorce_zlozone.kaczki.fabryka.FabrykaKaczekZLicznikiem;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class Main {
    public Main() {
        AbstrakcyjnaFabrykaKaczek kaczkaFabryka = new FabrykaKaczekZLicznikiem();
        uruchom(kaczkaFabryka);
    }

    private void uruchom(AbstrakcyjnaFabrykaKaczek kaczkaFabryka) {
        Kwaczaca plaskonosKaczka = kaczkaFabryka.utworzPlaskonosKaczka();
        Kwaczaca wabikKaczka = kaczkaFabryka.utworzWabikKaczka();
        Kwaczaca gumowaKaczka = kaczkaFabryka.utworzGumowaKaczka();
        Kwaczaca gesKaczka = new GesAdapter(new Ges());
        System.out.println("Symulator kaczek: ze wzorcem kompozyt - stada");

        Stado stadoKaczek = new Stado();

        stadoKaczek.dodaj(plaskonosKaczka);
        stadoKaczek.dodaj(wabikKaczka);
        stadoKaczek.dodaj(gumowaKaczka);
        stadoKaczek.dodaj(gesKaczka);

        Stado stadoDzikichKaczek = new Stado();

        Kwaczaca dzikaKaczkaJeden = kaczkaFabryka.utworzDzikaKaczka();
        Kwaczaca dzikaKaczkaDwa = kaczkaFabryka.utworzDzikaKaczka();
        Kwaczaca dzikaKaczkaTrzy = kaczkaFabryka.utworzDzikaKaczka();
        Kwaczaca dzikaKaczkaCztery = kaczkaFabryka.utworzDzikaKaczka();

        stadoDzikichKaczek.dodaj(dzikaKaczkaJeden);
        stadoDzikichKaczek.dodaj(dzikaKaczkaDwa);
        stadoDzikichKaczek.dodaj(dzikaKaczkaTrzy);
        stadoDzikichKaczek.dodaj(dzikaKaczkaCztery);

        stadoKaczek.dodaj(stadoDzikichKaczek);

        System.out.println("Symulator kaczek: Symulacja całego stada");
        uruchom(stadoKaczek);

        System.out.println("\n Symulator kaczek: Symulacja stada dzikich kaczek");
        uruchom(stadoDzikichKaczek);

        System.out.println("\nKaczki kwaknely " + KwakLicznik.getLiczbaKwakniec() + " raz/y");
    }

    private void uruchom(Kwaczaca kaczka) {
        kaczka.kwacz();
    }

    public static void main(String[] args) {
        new Main();
    }
}
