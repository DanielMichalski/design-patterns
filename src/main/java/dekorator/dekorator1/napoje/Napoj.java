package dekorator.dekorator1.napoje;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public abstract class Napoj {
    String opis = "Napój nieznany";

    public String pobierzOpis() {
        return opis;
    }

    public abstract double koszt();
}
