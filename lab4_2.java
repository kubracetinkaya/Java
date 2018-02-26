/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class lab4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = 0;
        float bakiye = 0;
        while (y != 4) {
            System.out.println("ne yapmak istersiniz");
            System.out.println("1-para çekme");
            System.out.println("2-para yatırma");
            System.out.println("3-bakiye sorgulama");
            System.out.println("4-çıkış");
            System.out.println("1-4 arasında işlem seçiniz");
            y = in.nextInt();
            switch (y) {
                case 1:
                    System.out.println("ne kadar para çekmek istersiniz");
                    int çekilen = in.nextInt();
                    if ((çekilen < 0) || (çekilen > bakiye)) {
                        System.out.println("yetersiz bakiye");
                    } else {
                        bakiye = bakiye - çekilen;
                    }
                    System.out.println("yeni bakiyeniz:" + bakiye);

                    break;
                case 2:
                    System.out.println("ne kadar para yatırmak istersiniz");
                    int yatır = in.nextInt();
                    if ((yatır < 0)) {
                        System.out.println("yatırılan negatif olamaz");

                    } else {
                        bakiye = bakiye + yatır;
                    }
                    System.out.println("yeni bakiyeniz:" + bakiye);
                    break;
                case 3:
                    System.out.println("hesabınızdaki para" + (bakiye));
                    break;
                case 4:
                    System.out.println("çıkış");
                    break;
            }

        }

    }

}
