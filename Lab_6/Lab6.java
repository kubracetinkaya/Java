
package lab7;

import java.util.Scanner;

public class Lab7 {


    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, -4, 5};
        diziYaz(dizi, " , ");
        int min = diziMin(dizi);
        System.out.println("dizinin en küçük elemanı" + min);
        int ind = diziMinIndex(dizi);
        System.out.println("dizinin en küçük elemanının indeksi " + ind);
        diziEkle(dizi);
        System.out.print("Eklenmis Hali");
        diziYaz(dizi, ",");

    }

    public static void diziYaz(int[] d, String ayraç) {
        for (int i = 0; i < d.length; i++) {

            System.out.print( d[i] + ayraç);

        }

    }
    

    public static int diziMin(int[] d) {
        int min = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] < min) {
                min = d[i];
            }

        }
        return min;

    }

    
    public static int diziMinIndex(int[] d) {
        int min = d[0];
        int ind = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] < min) {
                min = d[i];
                ind = i;

            }
        }
        return ind;
    }

    
    public static void diziEkle(int[] d) {
        Scanner in = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = in.nextInt();

        for (int i = 0; i < d.length; i++) {
            d[i] += a;
            

        }
    }

}

