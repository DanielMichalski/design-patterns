package singleton.kwiaciarnia_pj;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class PriceList {
    private static PriceList ourInstance = new PriceList();
    private Map<String, Integer> cennik;

    public static PriceList getInstance() {
        return ourInstance;
    }

    private PriceList() {
        cennik = new HashMap<String, Integer>();
    }

    public void set(String nazwaKwiatu, int cena) {
        cennik.put(nazwaKwiatu, cena);
    }

    public Integer get(String nazwaKwiatu) {
        return cennik.get(nazwaKwiatu);
    }
}
