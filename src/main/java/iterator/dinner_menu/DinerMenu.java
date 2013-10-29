package iterator.dinner_menu;

import iterator.PozycjaMenu;

import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class DinerMenu implements Iterable {
    public static final int MAKS_LICZBA_ELEMENTOW = 6;
    private int liczbaElementow = 0;
    private PozycjaMenu[] pozycjeMenu;

    public DinerMenu() {
        pozycjeMenu = new PozycjaMenu[MAKS_LICZBA_ELEMENTOW];

        dodajElement("Wegetariańska kanapka BSP",
                "(Wegetariański) Boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",
                true,
                2.99);

        dodajElement("Kanapka BSP",
                "Boczek z sałatą i pomidorem, chleb pszenny pełnoziarnisty",
                false,
                2.99);

        dodajElement("Zupa dnia",
                "Zupa dnia i sałatka z pomidora",
                false,
                3.29);

        dodajElement("Hot-dog",
                "Hot-dog z kiszoną kapustą, rzodkiewką, cebulą i dodatkiem sera",
                false,
                3.05);
    }

    public void dodajElement(String nazwa, String opis,
                             boolean wegetarianska, double cena) {
        PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetarianska, cena);
        if (liczbaElementow >= MAKS_LICZBA_ELEMENTOW) {
            System.err.println("Niestety, menu jest pełne!" +
                    "Nie można dodać nowej pozycji");
        } else {
            pozycjeMenu[liczbaElementow] = pozycjaMenu;
            liczbaElementow++;
        }
    }

    @Override
    public Iterator iterator() {
        return new DinerMenuIterator(pozycjeMenu);
    }
}
