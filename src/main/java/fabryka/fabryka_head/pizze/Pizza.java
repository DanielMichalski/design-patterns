package fabryka.fabryka_head.pizze;

import java.util.ArrayList;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public abstract class Pizza {
    String nazwa;
    String ciasto;
    String sos;
    ArrayList<String> dodatki = new ArrayList<String>();

    public void przygotowywanie() {
        System.out.println("Przygotowywanie: " + nazwa);
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu...");
        System.out.println("Dodatki:");
        for (String s : dodatki) {
            System.out.println("   " + s);
        }
    }

    public void pieczenie() {
        System.out.println("Pieczenie: 25 minut " +
                "w temperaturze 350 stopni Celsjusza");
    }

    public void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie pizzy" +
                "w oficjalne pudełko naszej Pizzerii");
    }

    public String getNazwa() {
        return nazwa;
    }
}
