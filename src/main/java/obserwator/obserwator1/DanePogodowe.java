package obserwator.obserwator1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class DanePogodowe implements Podmiot {
    private List<Obserwator> obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        this.obserwatorzy = new ArrayList<Obserwator>();
    }

    @Override
    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if (i >= 0)
            obserwatorzy.remove(i);
    }

    @Override
    public void powiadomObserwatorow() {
        for (Obserwator obserwator : obserwatorzy)
            obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
    }

    public void odczytZmiana() {
        powiadomObserwatorow();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytZmiana();
    }
}
