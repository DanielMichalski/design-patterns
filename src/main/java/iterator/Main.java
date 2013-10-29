package iterator;

import iterator.dinner_menu.DinerMenu;
import iterator.pancake_house_menu.PancakeHouseMenu;
import iterator.u_jacka_menu.UJackaMenu;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class Main {
    public static void main(String[] args) {
        Iterable pancakeHouseMenu = new PancakeHouseMenu();
        Iterable dinerMenu = new DinerMenu();
        Iterable uJackaMenu = new UJackaMenu();

        Kelnerka kelnerka = new Kelnerka(pancakeHouseMenu, dinerMenu, uJackaMenu);
        kelnerka.drukujMenu();
    }
}
