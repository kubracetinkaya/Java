
package lab4;

import java.util.Scanner;


public class lab4_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = (int) (Math.random() * 100) + 1;
        System.out.println(r);
        int tahminSayısı = 0;
        int tahmin = -1;
        while (r != tahmin) {
            System.out.println("bir tahmin giriniz");
            tahmin = in.nextInt();
            tahminSayısı = tahminSayısı + 1;
            if (tahmin > r) {
                System.out.println("in");
            } else if (tahmin < r) {
                System.out.println("çık");
            } else {
                System.out.println("tebrikler:"+ "sayıyı" + tahminSayısı + "denemede buldunuz");
            }

        }

    }
}
