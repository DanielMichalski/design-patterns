package singleton.singleton_head.singletons;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Singleton3 {
    private static Singleton3 ourInstance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton3.class) {
                if (ourInstance == null)
                    ourInstance = new Singleton3();
            }
        }
        return ourInstance;
    }
}
