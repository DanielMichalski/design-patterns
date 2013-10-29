package singleton.singleton_head;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class CzekoladowyKociol {
    private boolean pusty;
    private boolean ugotowany;

    private static CzekoladowyKociol instance = new CzekoladowyKociol();

    private CzekoladowyKociol() {
        this.pusty = true;
        this.ugotowany = false;
    }

    public static CzekoladowyKociol getInstance() {
        return instance;
    }

    public void napelnij() {
        if (jestPusty()) {
            pusty = false;
            ugotowany = false;
            // napełnij boiler
        }
    }

    public void oproznij() {
        if (!jestPusty() && jestUgotowany()) {
            // opróżnij boiler
            pusty = true;
        }
    }

    public void gotuj() {
        if (!jestPusty() && !jestUgotowany()) {
            // gotuje zawartość kotła
            ugotowany = true;
        }
    }

    public boolean jestPusty() {
        return pusty;
    }

    public boolean jestUgotowany() {
        return ugotowany;
    }
}
