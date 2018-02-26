package nyp.lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NYPLab3 {

    public static void main(String[] args) {
        
         tahminOyunu x = new tahminOyunu();
                 x.sayıTut();
         x.oyunaBasla();
//         for (int i = 0; i < 10; i++) {
//         x.sayıTut();
//         System.out.println("Sayınız:" + x.hedefSayı);
//         }
         //System.out.println("Bir tahmin giriniz");
         /*
        JFrame frm = new JFrame("GUI Penceresi");
        frm.setSize(500, 300);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("GUI Programım.");

        lbl.setForeground(Color.ORANGE);
        frm.getContentPane().add(lbl);
        JButton btn = new JButton("Basma!");
        frm.getContentPane().add(btn);
        frm.setVisible(true);

    }
*/
}}
