package metoda_szablonowa.napoje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Daniel
 * Date: 12.08.13
 */

public class KawaZHaczykiem extends NapojZKofeina {
    @Override
    public void zaparzanie() {
        System.out.println(
                "Zaparzanie i przesączanie kawy przez filtr");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println(
                "Dodawanie cukru oraz mleka do smaku");
    }

    @Override
    public boolean czyKlientChceDodatki() {
        String odpowiedz = pobierzOdpowiedz();

        return odpowiedz.toLowerCase().startsWith("t");
    }

    private String pobierzOdpowiedz() {
        String odpowiedz = null;
        System.out.print("Czy życzy Pan sobie dodania" +
                "cukru i mleka do kawy (t/n)? ");

        InputStreamReader inStreamReader =
                new InputStreamReader(System.in);
        BufferedReader buffReader = new BufferedReader(inStreamReader);

        try {
            odpowiedz = buffReader.readLine();
        } catch (IOException e) {
            System.out.println("Błąd wejścia-wyjścia podczas" +
                    "odczytywania odpowiedzi");
        }

        if (odpowiedz == null) {
            return "nie";
        }
        return odpowiedz;
    }
}
