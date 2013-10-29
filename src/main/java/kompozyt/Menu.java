package kompozyt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class Menu extends MenuSkladnik {
    private List<MenuSkladnik> menuSkladniki;
    private String nazwa;
    private String opis;

    public Menu(String nazwa, String opis) {
        this.menuSkladniki = new ArrayList<MenuSkladnik>();
        this.nazwa = nazwa;
        this.opis = opis;
    }

    @Override
    public void dodaj(MenuSkladnik menuSkladnik) {
        menuSkladniki.add(menuSkladnik);
    }

    @Override
    public void unun(MenuSkladnik menuSkladnik) {
        menuSkladniki.remove(menuSkladnik);
    }

    @Override
    public MenuSkladnik pobierzPotomek(int i) {
        return menuSkladniki.get(i);
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String getOpis() {
        return opis;
    }

    @Override
    public void drukuj() {
        System.out.print("\n " + getNazwa());
        System.out.println(", " + getOpis());
        System.out.println("----------------");

        Iterator<MenuSkladnik> iterator = menuSkladniki.iterator();
        while (iterator.hasNext()) {
            MenuSkladnik menuSkladnik = iterator.next();
            menuSkladnik.drukuj();
        }
    }

    @Override
    public Iterator iterator() {
        return new IteratorKompozytu(menuSkladniki.iterator());
    }
}
