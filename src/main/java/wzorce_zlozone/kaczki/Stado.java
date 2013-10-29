package wzorce_zlozone.kaczki;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 15.08.13
 */

public class Stado implements Kwaczaca {
    ArrayList<Kwaczaca> ptaki = new ArrayList<Kwaczaca>();

    public void dodaj(Kwaczaca ptak) {
        ptaki.add(ptak);
    }

    @Override
    public void kwacz() {
        Iterator<Kwaczaca> iterator = ptaki.iterator();
        while (iterator.hasNext()) {
            Kwaczaca ptak = iterator.next();
            ptak.kwacz();
        }
    }
}
