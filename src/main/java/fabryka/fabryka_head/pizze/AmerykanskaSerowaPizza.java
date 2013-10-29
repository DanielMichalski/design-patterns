package fabryka.fabryka_head.pizze;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class AmerykanskaSerowaPizza extends Pizza {
    public AmerykanskaSerowaPizza() {
        nazwa = "Amerykanska pizza";
        ciasto = "Extra grube";
        sos = "Sos z pomidorów śliwkowych";

        dodatki.add("Grubo tarty ser Mozzarella");
    }

    @Override
    public void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
