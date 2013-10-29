package kompozyt;

import java.util.Iterator;
import java.util.Stack;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class IteratorKompozytu implements Iterator {
    private Stack<Iterator> stos;

    public IteratorKompozytu(Iterator iterator) {
        stos = new Stack<Iterator>();
        stos.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stos.peek();
            MenuSkladnik skladnik = (MenuSkladnik) iterator.next();
            if (skladnik instanceof Menu) {
                stos.push(skladnik.iterator());
            }
            return skladnik;
        } else {
            return null;
        }

    }

    @Override
    public boolean hasNext() {
        if (stos.empty())
            return false;
        else {
            Iterator iterator = stos.peek();
            if (!iterator.hasNext()) {
                stos.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
