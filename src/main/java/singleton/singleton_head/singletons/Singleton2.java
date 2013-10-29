package singleton.singleton_head.singletons;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Singleton2 {
    private static Singleton2 newInstance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return newInstance;
    }

}
