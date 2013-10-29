package dekorator.dekorator1.napoje;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Bezkofeinowa extends Napoj {
    public Bezkofeinowa() {
        opis = "Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }
}
