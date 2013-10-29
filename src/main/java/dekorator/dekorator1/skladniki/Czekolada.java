package dekorator.dekorator1.skladniki;

import dekorator.dekorator1.napoje.Napoj;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Czekolada extends SkladnikDekorator {
    Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Czekolada";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.2;
    }
}
