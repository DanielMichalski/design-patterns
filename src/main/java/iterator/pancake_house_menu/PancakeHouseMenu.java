package iterator.pancake_house_menu;

import iterator.PozycjaMenu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class PancakeHouseMenu implements Iterable {
    private ArrayList<PozycjaMenu> pozycjeMenu;

    public PancakeHouseMenu() {
        pozycjeMenu = new ArrayList<PozycjaMenu>();

        dodajElement("Śniadanie naleśnikowe K&B",
                "Naleśniki z jajecznicą i tostem",
                true,
                2.99);

        dodajElement("Śniadanie naleśnikowe zwykłe",
                "Naleśniki z jajkiem sadzonym i kiełbasą",
                false,
                2.99);

        dodajElement("Naleśniki z jagodami",
                "Naleśniki ze świeżymi jagodami",
                true,
                3.49);

        dodajElement("Wafle nadziewane",
                "Wafle z jagodami lub truskawkami",
                true,
                3.59);
    }

    public void dodajElement(String nazwa, String opis, boolean wegetarianska, double cena) {
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
        pozycjeMenu.add(pozycjaMenu);
    }

    @Override
    public Iterator iterator() {
        return pozycjeMenu.iterator();
    }
}
