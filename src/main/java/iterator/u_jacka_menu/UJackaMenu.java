package iterator.u_jacka_menu;

import iterator.PozycjaMenu;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class UJackaMenu implements Iterable {
    private Hashtable<String, PozycjaMenu> pozycjeMenu;

    public UJackaMenu() {
        pozycjeMenu = new Hashtable<String, PozycjaMenu>();

        dodajElement("Kanapka wegetarianska z frytkami",
                "Kanapka wegetariańska z sałatą i pomidorem, frytki",
                true,
                3.99);

        dodajElement("Zupa dnia",
                "Filiżanka zupy dnia, sałatka",
                false,
                3.69);

        dodajElement("Burito",
                "Duże burito z łaciatą fasolą, sosem salsa i guacomoe (awokado)",
                true,
                4.29);
    }

    public void dodajElement(String nazwa, String opis,
                             boolean wegetarianska, double cena) {
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
        pozycjeMenu.put(pozycjaMenu.getNazwa(), pozycjaMenu);
    }

    @Override
    public Iterator iterator() {
        return pozycjeMenu.values().iterator();
    }
}
