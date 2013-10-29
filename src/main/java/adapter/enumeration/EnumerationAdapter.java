package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class EnumerationAdapter<V> implements Enumeration<V> {
    private Iterator<V> iterator;

    public EnumerationAdapter(Iterator<V> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public V nextElement() {
        return iterator.next();
    }
}
