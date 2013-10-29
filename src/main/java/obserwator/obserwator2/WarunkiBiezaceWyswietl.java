package obserwator.obserwator2;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class WarunkiBiezaceWyswietl implements Observer, obserwator.obserwator2.WyswietlElement {
    Observable observable;
    private float temperatura;
    private float wilgotnosc;

    public WarunkiBiezaceWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) o;
            this.temperatura = danePogodowe.getTemperatura();
            this.wilgotnosc = danePogodowe.getWilgotnosc();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące " + temperatura +
                " stopni C oraz " + wilgotnosc + "% wilgotności.");
    }
}
