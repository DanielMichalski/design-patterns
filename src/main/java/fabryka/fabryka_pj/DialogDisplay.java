package fabryka.fabryka_pj;

import javax.swing.*;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class DialogDisplay implements MsgDisplay {
    @Override
    public void show(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
