package singleton.singleton_pj;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {
    }

    public static synchronized ClassicSingleton getInstance() {
        if (instance == null) {
            synchronized (ClassicSingleton.class) {
                if (instance == null)
                    instance = new ClassicSingleton();
            }
        }
        return instance;
    }
}
