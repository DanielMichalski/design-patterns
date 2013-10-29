package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class IteratorAdapter<V> implements Iterator<V> {
    private Enumeration<V> enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public V next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
