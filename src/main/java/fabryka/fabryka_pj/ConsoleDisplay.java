package fabryka.fabryka_pj;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class ConsoleDisplay implements MsgDisplay {
    @Override
    public void show(String message) {
        System.out.println(message);
    }
}
