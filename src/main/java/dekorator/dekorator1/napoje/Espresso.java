package dekorator.dekorator1.napoje;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Espresso extends Napoj {
    public Espresso() {
        opis = "Kawa Espresso";
    }

    @Override
    public double koszt() {
        return 1.99;
    }
}
