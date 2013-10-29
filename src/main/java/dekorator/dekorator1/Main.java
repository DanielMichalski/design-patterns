package dekorator.dekorator1;

import dekorator.dekorator1.napoje.Espresso;
import dekorator.dekorator1.napoje.MocnoPalona;
import dekorator.dekorator1.napoje.Napoj;
import dekorator.dekorator1.napoje.StarCafeSpecial;
import dekorator.dekorator1.skladniki.BitaSmietana;
import dekorator.dekorator1.skladniki.Czekolada;
import dekorator.dekorator1.skladniki.MleczkoSojowe;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Main {
    public static void main(String[] args) {
        Napoj napoj = new Espresso();
        System.out.println(napoj.pobierzOpis() + " " +
                napoj.koszt() + " zł");

        Napoj napoj2 = new MocnoPalona();
        napoj2 = new Czekolada(napoj2);
        napoj2 = new Czekolada(napoj2);
        napoj2 = new BitaSmietana(napoj2);
        System.out.println(napoj2.pobierzOpis() + " " +
                napoj2.koszt() + " zł");

        Napoj napoj3 = new StarCafeSpecial();
        napoj3 = new MleczkoSojowe(napoj3);
        napoj3 = new Czekolada(napoj3);
        napoj3 = new BitaSmietana(napoj3);
        System.out.println(napoj3.pobierzOpis() + " " +
                napoj3.koszt() + " zł");
    }
}
