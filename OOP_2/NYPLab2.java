package nyp.lab2;

import static java.rmi.server.ObjID.read;
import java.util.Scanner;
import static javax.imageio.ImageIO.read;
import javax.swing.JOptionPane;

public class NYPLab2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Dikdortgen d1 = new Dikdortgen();
        Dikdortgen d2 = new Dikdortgen();
        Dikdortgen d3 = new Dikdortgen();

        System.out.println("sol üst x değeri:" + d1.solust_x);
        System.out.println("sol üst y değeri:" + d1.solust_y);
        System.out.println("genişlik:" + d1.genislik);
        System.out.println("yükseklik:" + d1.yukseklik);

        d1.solust_x = 5;
        d1.solust_y = 3;
        d1.genislik = 7;
        d1.yukseklik = 8;

        System.out.println("sol üst x değeri:" + d1.solust_x);
        System.out.println("sol üst y değeri:" + d1.solust_y);
        System.out.println("genişliş:" + d1.genislik);
        System.out.println("yükseklik:" + d1.yukseklik);

        System.out.println("sol üst x değeri:" + d2.solust_x);
        System.out.println("sol üst y değeri:" + d2.solust_y);
        System.out.println("genişlil:" + d2.genislik);
        System.out.println("yükseklik:" + d2.yukseklik);

        d2.solust_x = 6;
        d2.solust_y = 4;
        d2.genislik = 8;
        d2.yukseklik = 9;

        System.out.println("sol üst x değeri:" + d2.solust_x);
        System.out.println("sol üst y değeri:" + d2.solust_y);
        System.out.println("genişlil:" + d2.genislik);
        System.out.println("yükseklik:" + d2.yukseklik);

        DikdortgenCiz(d1);
        DikdortgenCiz(d2);
        d1.Ciz();
        d2.Ciz();

        int x = d1.alan();
        System.out.println("alan:" + x);
        int y = d2.alan();
        System.out.println("alan:" + y);

        String z = d1.bilgiler();
        System.out.println(z);

        String k = d2.bilgiler();
        System.out.println(k);

        Dikdortgen[] dizi = new Dikdortgen[4];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = new Dikdortgen();
            System.out.println("genislik gir");
            dizi[i].genislik = in.nextInt();
            System.out.println("yukseklik gir");
            dizi[i].yukseklik = in.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i + 1 + ". bilgi: " + dizi[i].bilgiler());
            dizi[i].Ciz();
        }

        if (d1.icinde_mi(1, 1) == false) {
            System.out.println("içinde değil");
        } else {
            System.out.println("içinde");
        }

    }

    public static void DikdortgenCiz(Dikdortgen k) {
        System.out.println(" ");
        for (int i = 0; i < k.genislik; i++) {
            System.out.print("-");
        }
        System.out.println("");

        for (int i = 0; i < k.yukseklik; i++) {
            System.out.print("|");
            for (int j = 0; j < k.genislik; j++) {
                System.out.print(" ");

            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int i = 0; i < k.genislik; i++) {
            System.out.print("-");
        }
        System.out.println("");
                
     
         
    }

}
