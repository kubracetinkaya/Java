package diziler.çalışma;

import java.util.Scanner;

public class DizilerÇalışma {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int üs = 1;
        System.out.println("2'nin 0. kuvveti:" + üs);
        int dizi[] = new int[20];
        for (int i = 1; i < 20; i++) {
            üs *= 2;
            System.out.println("dizi[]nin" + i + "nci kuvveti:" + üs);

        }
       
        int üs1 = 1;
        System.out.println("2'nin 0. kuvveti:" + üs1);
        int dizi1[] = new int[20];
        for (int i = 1; i < 20; i++) {
            üs1 *= 2;
            System.out.println("dizi[]nin" + i + "nci kuvveti:" + üs1);

            double ortalama = in.nextDouble();
            ortalama = üs1 / 20;
            System.out.println("ortalama");

        }

        
        int i = 0, t = 0;
       
        System.out.println("bir sayı giriniz");
        i = in.nextInt();
          while (i >= 0) {
            System.out.println("olmadi. tekrar giriniz");
         t += i;
        i = in.nextInt();
                      

               System.out.println(t);
        }
           t=0;
          for (int k = 0; k < 50; k++) {
          i = in.nextInt();
        t += i;
        System.out.println(k);
        }
        double ort = t / 50;
        ort=in.nextDouble();
        System.out.println(ort);
        t = 0;
        for (int k = 0; k < 50; k++) {
//          t += (sayi - ort)*(sayi - ort);
        }
        double std = t / 50.0;
        
       

    }
}
