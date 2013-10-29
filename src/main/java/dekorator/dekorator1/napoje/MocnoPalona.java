package dekorator.dekorator1.napoje;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class MocnoPalona extends Napoj {
    public MocnoPalona() {
        opis = "Mocno Palona";
    }

    @Override
    public double koszt() {
        return 0.99;
    }
}
