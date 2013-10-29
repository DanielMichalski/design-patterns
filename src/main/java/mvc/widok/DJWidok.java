package mvc.widok;

import mvc.controller.BeatControllerInterfejs;
import mvc.model.BeatModelInterfejs;
import mvc.model.ObserwatorBMP;
import mvc.model.ObserwatorUderzen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Daniel
 * Date: 15.08.13
 */

public class DJWidok implements ActionListener, ObserwatorUderzen, ObserwatorBMP {
    private BeatModelInterfejs model;
    private BeatControllerInterfejs kontroler;

    private JFrame widokFrame;
    private JPanel widokPanel;
    private JProgressBar beatBar;
    private JLabel bmpWyjscieLbl;

    private JFrame sterowanieFrame;
    private JPanel sterowaniePanel;
    private JLabel bmpLabel;
    private JTextField bmpTextField;
    private JButton ustawBmpButton;
    private JButton zwiekszBMPButton;
    private JButton zmniejszBMPButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;


    public DJWidok(BeatModelInterfejs model, BeatControllerInterfejs kontroler) {
        this.model = model;
        this.kontroler = kontroler;
        model.zarejestrujObserwatora((ObserwatorUderzen) this);
        model.zarejestrujObserwatora((ObserwatorBMP) this);
    }

    public void utworzWidok() {
        widokPanel = new JPanel(new GridLayout(1, 2));
        widokFrame = new JFrame("Widok");
        widokFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        widokFrame.setSize(100, 80);
        bmpWyjscieLbl = new JLabel("offline", SwingConstants.CENTER);
        beatBar = new JProgressBar();
        beatBar.setValue(0);
        JPanel bmpPanel = new JPanel(new GridLayout(2, 1));
        bmpPanel.add(beatBar);
        bmpPanel.add(bmpWyjscieLbl);
        widokPanel.add(bmpPanel);
        widokFrame.getContentPane().add(widokPanel, BorderLayout.CENTER);
        widokFrame.pack();
        widokFrame.setVisible(true);
    }

    public void utworzElementySterujace() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        sterowanieFrame = new JFrame("Sterowanie");
        sterowanieFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sterowanieFrame.setSize(100, 80);

        sterowaniePanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroler.start();
            }
        });

        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroler.stop();
            }
        });

        JMenuItem exit = new JMenuItem("Zamknij");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(exit);
        menuBar.add(menu);
        sterowanieFrame.setJMenuBar(menuBar);

        bmpTextField = new JTextField(2);
        bmpLabel = new JLabel("BMP", SwingConstants.RIGHT);
        ustawBmpButton = new JButton("Ustaw");
        ustawBmpButton.setSize(10, 40);
        zwiekszBMPButton = new JButton(">>");
        zmniejszBMPButton = new JButton("<<");
        ustawBmpButton.addActionListener(this);
        zwiekszBMPButton.addActionListener(this);
        zmniejszBMPButton.addActionListener(this);

        JPanel przyciskiPanel = new JPanel(new GridLayout(1, 2));

        przyciskiPanel.add(zmniejszBMPButton);
        przyciskiPanel.add(zwiekszBMPButton);

        JPanel wprowadzanieDanychPanel = new JPanel(new GridLayout(1, 2));
        wprowadzanieDanychPanel.add(bmpLabel);
        wprowadzanieDanychPanel.add(bmpTextField);
        JPanel sterowanieWewnPanel = new JPanel(new GridLayout(3, 1));
        sterowanieWewnPanel.add(wprowadzanieDanychPanel);
        sterowanieWewnPanel.add(ustawBmpButton);
        sterowanieWewnPanel.add(przyciskiPanel);
        sterowanieWewnPanel.add(sterowanieWewnPanel);

        bmpLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bmpWyjscieLbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        sterowanieFrame.getRootPane().setDefaultButton(ustawBmpButton);
        sterowanieFrame.getContentPane().add(sterowaniePanel, BorderLayout.CENTER);

        sterowanieFrame.pack();
        sterowanieFrame.setVisible(true);
    }

    public void aktywujStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void dezaktywujStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void aktywujStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void dezaktywujStartMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void aktualizujBMP() {
        if (model != null){
            int bmp = model.getBMP();
            if (bmp == 0) {
                if (bmpWyjscieLbl != null) {
                    bmpWyjscieLbl.setText("offline");
                }
            } else {
                if (bmpWyjscieLbl != null)  {
                    bmpWyjscieLbl.setText("Bieżąca wartość BMP: " +
                            model.getBMP());
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ustawBmpButton) {
            int bmp = Integer.parseInt(bmpTextField.getText());
            kontroler.ustawBMP(bmp);
        } else if (e.getSource() == zwiekszBMPButton) {
            kontroler.zwiekszBMP();
        } else if (e.getSource() == zmniejszBMPButton) {
            kontroler.zmniejszBMP();
        }

    }

    public void aktualizujBeat() {
        beatBar.setValue(100);
    }
}
