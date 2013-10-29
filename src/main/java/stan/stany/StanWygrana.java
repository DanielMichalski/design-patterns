package stan.stany;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class StanWygrana implements Stan {
    private Automat automat;

    public StanWygrana(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Bład wrzucania monety");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Błąd zwracania monety");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Błąd przekręcania gałki");
    }

    @Override
    public void wydaj() {
        System.out.println("WYGRAŁEŚ! Dostajesz drugą gumę");
        automat.zwolnijGume();
        if (automat.getLiczba() == 0) {
            automat.ustawStan(automat.getStanBrakGum());
        } else {
            automat.zwolnijGume();
            if (automat.getLiczba() > 0) {
                automat.ustawStan(automat.getStanNieMaMonety());
            } else {
                System.out.println("Ups, koniec gum!");
                automat.ustawStan(automat.getStanBrakGum());
            }
        }

    }
}
