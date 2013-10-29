package iterator;

import java.util.ArrayList;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class Kelnerka {
    private ArrayList<Iterable> menu;

    public Kelnerka(Iterable pancakeHouseMenu,
                    Iterable dinerMenu,
                    Iterable uJackaMenu) {
        menu = new ArrayList<Iterable>();
        menu.add(pancakeHouseMenu);
        menu.add(dinerMenu);
        menu.add(uJackaMenu);
    }

    public void drukujMenu() {
        for (Iterable iterable : menu) {
            drukujMenu(iterable);
        }
    }

    private void drukujMenu(Iterable iterable) {
        for (Object object : iterable) {
            PozycjaMenu pozycjaMenu = (PozycjaMenu) object;
            System.out.print(pozycjaMenu.getNazwa() + ", ");
            System.out.print(pozycjaMenu.getCena() + " -- ");
            System.out.println(pozycjaMenu.getOpis());
        }
    }
}
