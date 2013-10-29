package stan.stany;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class StanGumaSprzedana implements Stan {
    private Automat automat;

    public StanGumaSprzedana(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Proszę czekać na gumę");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Niestety nie można zwrócić" +
                "monety po przekręceniu gałki");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Nie dostaniesz gumy tylko dlatego," +
                " że przekręciłeś drugi raz!");
    }

    @Override
    public void wydaj() {
        automat.zwolnijGume();
        if (automat.getLiczba() > 0) {
            automat.ustawStan(automat.getStanNieMaMonety());
        } else {
            System.out.println("Ups, koniec gum!");
            automat.ustawStan(automat.getStanBrakGum());
        }
    }
}
