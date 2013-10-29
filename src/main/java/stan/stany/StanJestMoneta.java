package stan.stany;

import java.util.Random;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class StanJestMoneta implements Stan {
    private Random losowaWygrana =
            new Random(System.currentTimeMillis());
    private Automat automat;

    public StanJestMoneta(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Nie możesz włożyć " +
                "więcej niż jednej monety");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Moneta zwrócona");
        automat.ustawStan(automat.getStanNieMaMonety());
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Obróciłeś gałkę...");
        int wygrana = losowaWygrana.nextInt(10);
        if (wygrana == 0) {
            automat.ustawStan(automat.getStanWygrana());
        } else {
            automat.ustawStan(automat.getStanGumaSprzedana());
        }
    }

    @Override
    public void wydaj() {
        System.out.println("Nie wydano gumy");
    }
}
