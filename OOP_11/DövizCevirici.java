package nyp.lab11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static java.lang.Boolean.TRUE;
import java.text.NumberFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DövizCevirici extends JFrame {

    JTextField tgir;
    JLabel sonuc;
    JLabel kur1, kur2;
    String[] dövizler;
    double[] oranlar;
    double oran;
    NumberFormat nf;

    public DövizCevirici() {
        dövizlerioku();
        GUI_Hazirla();

    }

    private void dövizlerioku() {
        String[] d = {"türk lirası", "amerikan doları", "euro", "japon yeni", "çin yuanı"};
        double[] o = {1, 2.8220, 3.1941, 0.0254, 0.4345};
        dövizler = d;
        oranlar = o;
        oran = 2.82;

    }

    private void GUI_Hazirla() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 100);

        Font f = new Font("Arial", Font.BOLD, 20);
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnl.setLayout(new GridLayout(0, 5, 10, 10));

        nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        tgir = new JFormattedTextField(nf);
        tgir.setText("0");
        tgir.setColumns(9);
        tgir.setHorizontalAlignment(JTextField.RIGHT);
        tgir.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                tgir.setBackground(Color.white);
            }

            @Override
            public void focusLost(FocusEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        pnl.add(tgir);
        kur1 = new JLabel("Türk Lirası");
        kur2 = new JLabel("Amerikan Doları");
        sonuc = new JLabel("0");
        sonuc.setSize(0, 10);
        pnl.add(kur1);

        JButton hesapla = new JButton("Çevir");
        hesapla.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = nf.parse(tgir.getText()).doubleValue();

                    sonuc.setText(x / oran + "");
                } catch (Exception fe) {
                    tgir.setBackground(Color.red);
                }
            }
        });
        pnl.add(hesapla);
        pnl.add(sonuc);
        pnl.add(kur2);
        this.add(pnl, BorderLayout.CENTER);
        this.setVisible(true);
    }

}
