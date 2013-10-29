package adapter.head;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class DzikaKaczka implements Kaczka {
    @Override
    public void kwacz() {
        System.out.println("Kwa! Kwa!");
    }

    @Override
    public void lataj() {
        System.out.println("O rany! Latam!");
    }
}
