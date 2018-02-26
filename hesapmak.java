package nyp.lab10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hesapmak extends JFrame implements ActionListner {

    Font font1 = new Font("Courier", Font.BOLD, 40);

    String[] numListe = {"7", "8", "9", "4", "5", "6", "1", "2", "3", ".", "0"};

    String[] tuslar = {"+", "-", "*", "/", "="};

    JButton[] butonlar = new JButton[11];

    JButton[] işbutonları = new JButton[5];

    JTextField textfie;

    boolean number = true;

    int sayac = 0;

    int işsıra = 0;

    boolean kokbasildimi = false;

    double say1 = 0, sayı2 = 0, sonuc = 0;

    boolean işbubasıldımı = false;

    boolean eşittirbasıldımı = false;

    public hesapmak() {

        setSize(400, 300);

        setLocation(600, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Hesap Makinesi");

        JPanel butonpaneli = new JPanel();

        butonpaneli.setOpaque(false);

        butonpaneli.setBackground(Color.black);

        butonpaneli.setLayout(new GridLayout(4, 4, 9, 9));

        butonpaneli.setBorder(BorderFactory.createEmptyBorder(9, 9, 9, 9));

        JPanel tpaneli = new JPanel();

        tpaneli.setLayout(new GridLayout(1, 4));

        tpaneli.setBorder(BorderFactory.createEmptyBorder(9, 9, 9, 9));

        textfie = new JTextField("0", 12);

        textfie.setHorizontalAlignment(JTextField.RIGHT);

        textfie.setFont(font1);

        textfie.setBorder(BorderFactory.createLoweredBevelBorder());

        tpaneli.add(textfie);

        for (int i = 0; i < butonlar.length; i++) {

            JButton b = new JButton(numListe[i]);

           // b.addActionListener(this);

            b.setFont(font1);

            butonlar[i] = b;

            butonpaneli.add(b);

        }

        JPanel iPanel = new JPanel();

        iPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        iPanel.setLayout(new GridLayout(3, 2, 5, 5));

        for (int i = 0; i < tuslar.length; i++) {

            JButton is = new JButton(tuslar[i]);

            is.setBackground(Color.orange);

            is.setFont(font1);

            işbutonları[i] = is;

           //  is.addActionListener((ActionListener) this);

            iPanel.add(is);

        }

        this.add(iPanel, BorderLayout.EAST);

        JPanel panelimiz = new JPanel();

        panelimiz.setLayout(new BorderLayout(4, 4));

        panelimiz.add(tpaneli, BorderLayout.NORTH);

        panelimiz.add(butonpaneli, BorderLayout.CENTER);

        panelimiz.add(iPanel, BorderLayout.EAST);

        add(panelimiz);

        setVisible(true);

    }

   

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(textfie.getText());

        textfie.setBackground(Color.white);

        if (a == 0) {

            for (int i = 0; i < butonlar.length; i++) {

                if (e.getSource() == butonlar[9]) {

                } else if (e.getSource() == butonlar[i]) {

                    textfie.setText(butonlar[i].getText());

                }

            }

        } else {

            if (e.getSource() == işbutonları[4]) {

                if (işsıra == 1) {

                    sayı2 = Double.parseDouble(textfie.getText());

                    sonuc = say1 + sayı2;

                    işbubasıldımı = true;

                    String ssonuc = "" + sonuc;

                    textfie.setText(ssonuc);

                    eşittirbasıldımı = true;

                } else if (işsıra == 2) {

                    sayı2 = Double.parseDouble(textfie.getText());

                    sonuc = say1 - sayı2;

                    işbubasıldımı = true;

                    String ssonuc = "" + sonuc;

                    textfie.setText(ssonuc);

                    eşittirbasıldımı = true;

                } else if (işsıra == 3) {

                    sayı2 = Double.parseDouble(textfie.getText());

                    sonuc = say1 * sayı2;

                    işbubasıldımı = true;

                    String ssonuc = "" + sonuc;

                    textfie.setText(ssonuc);

                    eşittirbasıldımı = true;

                } else if (işsıra == 4) {

                    sayı2 = Double.parseDouble(textfie.getText());

                    sonuc = say1 / sayı2;

                    işbubasıldımı = true;

                    String ssonuc = "" + sonuc;

                    textfie.setText(ssonuc);

                    eşittirbasıldımı = true;

                }

            }

            if (e.getSource() == işbutonları[0]) {

                say1 = Double.parseDouble(textfie.getText());

                işsıra = 1;

                textfie.setText("0");

            } else if (e.getSource() == işbutonları[1]) {

                say1 = Double.parseDouble(textfie.getText());

                işsıra = 2;

                textfie.setText("0");

            } else if (e.getSource() == işbutonları[2]) {

                say1 = Double.parseDouble(textfie.getText());

                işsıra = 3;

                textfie.setText("0");

            } else if (e.getSource() == işbutonları[3]) {

                say1 = Double.parseDouble(textfie.getText());

                işsıra = 4;

                textfie.setText("0");

            }

            if (sayac < 1 && e.getSource() == butonlar[9]) {

                textfie.setText(textfie.getText() + butonlar[9].getText());

                sayac++;

            }

            for (int i = 0; i < butonlar.length; i++) {

                if (e.getSource() == butonlar[9]) {

                } else if (e.getSource() == butonlar[i]) {

                    if (eşittirbasıldımı == true) {

                        textfie.setText(butonlar[i].getText());

                        eşittirbasıldımı = false;

                        sayac = 0;

                    } else {

                        textfie.setText(textfie.getText() + butonlar[i].getText());

                    }

                }

            }
          


        }

    }
}
