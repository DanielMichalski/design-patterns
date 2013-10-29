package obserwator.obserwator2;

import java.util.Observable;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class DanePogodowe extends Observable {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
    }

    private void odczytZmiany() {
        setChanged();
        notifyObservers();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytZmiany();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}
