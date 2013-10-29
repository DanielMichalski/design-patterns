package dekorator.dekorator1.napoje;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class StarCafeSpecial extends Napoj {
    public StarCafeSpecial() {
        opis = "Kawa Star Cafe Special";
    }

    @Override
    public double koszt() {
        return 0.89;
    }
}
