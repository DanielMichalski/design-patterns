package kompozyt;

import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 13.08.13
 */

public class IteratorPusty implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
