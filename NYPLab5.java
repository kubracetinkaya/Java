package nyp.lab5;

import java.util.Scanner;

public class NYPLab5 {

    public static void main(String[] args) {

        tarih t1 = new tarih(1, 1, 2016);
        tarih t2 = new tarih(10, 4, 2016);
        System.out.println("Tarih 1:" + t1);
        System.out.println("Tarih 2:" + t2);
        System.out.println("--------------------------");

        int say = 0;
        while (t1.karşılaştır(t2) < 0) {
            t1.ertesiGün();
            say++;
            System.out.println("Tarih: " + t1 + ". Gün: " + say);
        }

        t1.setTarih(1, 1, 2016);
        int say1 = t1.arasıKaçGün(t2);
        System.out.println("Arası " + say1);
        say1 = t2.arasıKaçGün(t1);
        System.out.println("Arası " + say1);

        Scanner oku = new Scanner(System.in);
        System.out.println("Doğum Tarihiniz:");
        System.out.println("GÜN:");
        int gün = oku.nextInt();
        System.out.println("AY:");
        int ay = oku.nextInt();
        System.out.println("YIL:");
        int yıl = oku.nextInt();
        t1.setTarih(gün, ay, yıl);
        t2.setTarih(16, 3, 2016);
        int günlük = t1.arasıKaçGün(t2);
        System.out.println(günlük + " günlüksünüz. (" + (günlük / 365.0) + " yıl)");

    }

}
