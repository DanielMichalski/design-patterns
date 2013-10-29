package singleton.singleton_head.singletons;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Singleton1 {
    private static Singleton1 unikalnaInstancja;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (unikalnaInstancja == null)
            unikalnaInstancja = new Singleton1();
        return unikalnaInstancja;
    }
}
