package metoda_szablonowa.kaczki;

import java.util.Arrays;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class Main {
    public static void main(String[] args) {
        Kaczka[] kaczki = {
                new Kaczka("Kaczor Daffy", 8),
                new Kaczka("Kaczor Dewey", 2),
                new Kaczka("Kaczor Howard", 7),
                new Kaczka("Kaczor Louide", 2),
                new Kaczka("Kaczor Donald", 10),
                new Kaczka("Kaczor Huey", 2)
        };

        System.out.println("Przed sortowaniem:");
        wyswietlaj(kaczki);

        Arrays.sort(kaczki);

        System.out.println("\nPo zakończeniu sortowania:");
        wyswietlaj(kaczki);
    }

    private static void wyswietlaj(Kaczka[] kaczki) {
        for (int i = 0; i < kaczki.length; i++) {
            System.out.println(kaczki[i]);
        }
    }
}
