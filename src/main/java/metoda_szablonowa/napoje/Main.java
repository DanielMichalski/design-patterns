package metoda_szablonowa.napoje;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class Main {
    public static void main(String[] args) {
        Herbata herbata = new Herbata();
        Kawa kawa = new Kawa();
        KawaZHaczykiem kawaZHaczykiem = new KawaZHaczykiem();

        System.out.println("herbata:");
        herbata.recepturaParzenia();

        System.out.println("\nkawa:");
        kawa.recepturaParzenia();

        System.out.println("\nkawa z haczykiem:");
        kawaZHaczykiem.recepturaParzenia();
    }
}
