package singleton.kwiaciarnia_pj;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Florist {
    public Florist() {
        // Ustalenie cennika
        PriceList pl = PriceList.getInstance();
        pl.set("róża", 10);
        pl.set("bez", 12);
        pl.set("piwonia", 8);
    }
}
