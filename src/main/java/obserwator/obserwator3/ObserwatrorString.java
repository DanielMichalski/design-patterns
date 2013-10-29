package obserwator.obserwator3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class ObserwatrorString {
    private JFrame frame;

    public static void main(String[] args) {
        ObserwatrorString przyklad = new ObserwatrorString();
        przyklad.uruchom();
    }

    private void uruchom() {
        frame = new JFrame();
        JButton button = new JButton("Czy powinienem to zrobić?");
        button.addActionListener(new AniolSluchacz());
        button.addActionListener(new DiabelSluchacz());
        frame.getContentPane().add(button, BorderLayout.CENTER);

        // parametry okienka
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class AniolSluchacz implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Nie rób tego! Możesz później żałować!");
        }
    }

    class DiabelSluchacz implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tak! Zrób to!");
        }
    }
}
