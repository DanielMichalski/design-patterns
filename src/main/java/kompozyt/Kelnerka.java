package kompozyt;

import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class Kelnerka {
    private MenuSkladnik wszystkieMenu;

    public Kelnerka(MenuSkladnik wszystkieMenu) {
        this.wszystkieMenu = wszystkieMenu;
    }

    public void drukujMenu() {
        wszystkieMenu.drukuj();
    }

    public void drukujMenuWegetarianskie() {
        Iterator iterator = wszystkieMenu.iterator();

        System.out.println("\nMENU WEGETARIAŃSKIE\n----");
        while (iterator.hasNext()) {
            MenuSkladnik menuSkladnik = (MenuSkladnik) iterator.next();
            try {
                if (menuSkladnik.czyWegetarianska())
                    menuSkladnik.drukuj();
            } catch (UnsupportedOperationException e) {}
        }
    }
}
