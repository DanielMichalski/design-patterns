package polecenie.pj;

import javax.swing.*;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class CommandTest {
    public static void main(String[] args) {
        String req = JOptionPane.showInputDialog("Podaj zlecenie do wykonania");
        List resList = serviceRequest(req);
    }

    private static List serviceRequest(String req) {
        Command cmd = null;
        try {
            Class klasa = Class.forName(req);
            cmd = (Command) klasa.newInstance();
            String data = JOptionPane.showInputDialog(
                    "-------------------  Podaj parametry -----------------");
            StringTokenizer st = new StringTokenizer(data, "()");
            while (st.hasMoreElements()) {
                String para = st.nextToken();
                String[] parm = para.split("#");
                cmd.setParameter(parm[0], parm[1]);
            }
            cmd.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cmd.getResult();

    }
}
