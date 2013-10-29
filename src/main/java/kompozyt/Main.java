package kompozyt;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class Main {
    public static void main(String[] args) {
        MenuSkladnik pancakeHouseMenu =
                new Menu("MENU PANCAKE HOUSE", "Sniadania");
        MenuSkladnik dinerMenu =
                new Menu("MENU RESTAURACJI DINER", "Lunch");
        MenuSkladnik uJackaMenu =
                new Menu("MENU U JACKA", "Obiady");
        MenuSkladnik deseryMenu =
                new Menu("MENU DESERÓW", "Desery, oczywiście!");

        MenuSkladnik wszystkieMenu =
                new Menu("WSZYSTKIE MENU", "Połączone menu");

        wszystkieMenu.dodaj(pancakeHouseMenu);
        wszystkieMenu.dodaj(dinerMenu);
        wszystkieMenu.dodaj(uJackaMenu);

        dinerMenu.dodaj(new PozycjaMenu(
                "Speghetti",
                "Makaron spaghetti z sosem marinara i kromka chleba na zakwasie",
                true,
                3.89
        ));

        dinerMenu.dodaj(deseryMenu);

        deseryMenu.dodaj(new PozycjaMenu(
                "Szarlotka",
                "Szarlotka z lodami waniliowymi",
                true,
                1.59
        ));

        Kelnerka kelnerka = new Kelnerka(wszystkieMenu);
        kelnerka.drukujMenuWegetarianskie();
    }
}
