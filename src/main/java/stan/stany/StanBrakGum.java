package stan.stany;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class StanBrakGum implements Stan {
    private Automat automat;

    public StanBrakGum(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozMonete() {
        System.out.println("Nie ma gum");
    }

    @Override
    public void zwrocMonete() {
        System.out.println("Nie ma gum");
    }

    @Override
    public void przekrecGalke() {
        System.out.println("Nie ma gum");
    }

    @Override
    public void wydaj() {
        System.out.println("Nie ma gum");
    }
}
