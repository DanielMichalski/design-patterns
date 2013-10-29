package adapter.enumeration;

import java.util.*;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class Main {
    public static void main(String[] args) {
        iteratorAdapterTest();
        enumerationAdapterTest();
    }

    private static void iteratorAdapterTest() {
        Vector<String> imiona = new Vector<String>();

        imiona.add("Tomasz");
        imiona.add("Kamil");
        imiona.add("Wojtek");

        Enumeration<String> elements = imiona.elements();
        IteratorAdapter<String> enumerationIterator = new IteratorAdapter<String>(elements);

        testIterator(enumerationIterator);
    }

    public static void testIterator(Iterator<String> iterator) {
        System.out.println("------------ Iterator Adapter ------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void enumerationAdapterTest() {
        List<String> lista = new ArrayList<String>();

        lista.add("jeden");
        lista.add("dwa");
        lista.add("trzy");

        Iterator<String> iterator = lista.iterator();
        EnumerationAdapter<String> enumerationAdapter = new EnumerationAdapter<String>(iterator);
        testEnumeration(enumerationAdapter);
    }

    public static void testEnumeration(Enumeration<String> enumeration) {
        System.out.println("------------ Enumeration adapter ------------");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
