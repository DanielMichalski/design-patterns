package dekorator.dekorator1.skladniki;

import dekorator.dekorator1.napoje.Napoj;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Mleko extends SkladnikDekorator {
    Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleko";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.1;
    }
}
