package iterator.dinner_menu;

import iterator.PozycjaMenu;

import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class DinerMenuIterator implements Iterator {
    private PozycjaMenu[] elementy;
    private int pozycja = 0;

    public DinerMenuIterator(PozycjaMenu[] elementy) {
        this.elementy = elementy;
    }

    @Override
    public boolean hasNext() {
        return !(pozycja >= elementy.length || elementy[pozycja] == null);
    }

    @Override
    public Object next() {
        PozycjaMenu pozycjaMenu = elementy[pozycja];
        pozycja++;
        return pozycjaMenu;
    }

    @Override
    public void remove() {
        if (pozycja <= 0) {
            throw new IllegalStateException(
                    "Nie można usunąć elementu przed" +
                            "pierwszym wywołaniem metody next()");
        }
        if (elementy[pozycja - 1] != null) {
            for (int i = pozycja - 1; i < (elementy.length - 1); i++) {
                elementy[i] = elementy[i + 1];
            }
            elementy[elementy.length - 1] = null;
        }
    }
}
