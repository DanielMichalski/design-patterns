package stan.stany;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class StanNieMaMonety implements Stan {
    private Automat automat;

    public StanNieMaMonety(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozMonete() {
        automat.ustawStan(automat.getStanJestMoneta());
        System.out.println("Moneta przyjęta");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Nie włożyłeś monety");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Zanim przekręcisz gałkę, wrzuć monetę");
    }

    @Override
    public void wydaj() {
        System.out.println("Najpierw zapłać");
    }
}
