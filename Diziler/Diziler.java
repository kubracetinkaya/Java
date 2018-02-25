
package diziler;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz");
        int N = in.nextInt();
        int[] dizi1 = new int[N];
        double[] dizi2 = new double[N];
        String[] dizi3 = new String[N];

        dizi3[0] = "fatma";
        dizi3[N - 1] = "kübra";

        for (int i = 0; i < N; i++) {
            System.out.println(dizi3[i]);

        }
        //20
        double i = 0;
        for (int j = 1; j < N; j++) {
            dizi2[j] = Math.sqrt(j);
            System.out.println(dizi2[j]);

        }
        //21
       
        double max = dizi2[0];
        double dizii[] = {9, 99,999};
        double min=dizii[0];
        for (int j = 0; j < 3; j++) {
            if (dizii[j] > max) {
                max = dizii[j];
            }
             if(dizii[j]<min){
                 min=dizii[j];
                 
             }

        }
        System.out.println("dizinin en küçük elemanı:"+min);
        System.out.println("dizinin en büyük elemanı:" + max);
        //22
        int[] notlar = new int[N];
        for (int k = 0; k < N; k++) {
            notlar[k] = (int) (Math.random() * 10);
            System.out.println(notlar[k]);

        }
        int toplam = 0;
        int carpım = 1;
        for (int j = 0; j < N; j++) {
            toplam += notlar[j];
            carpım *= notlar[j];

        }
        System.out.println("toplamınız:" + toplam);
        System.out.println("çarpımınız:" + carpım);

        //23,24,25
        for (int a = 0; a < N; a++) {
            dizi1[a] = (int) (Math.random() * 10);
            System.out.println(dizi1[a]);

        }
       
        int sayac = 0;
         int toplam2=0;
         int carpım2=1;
        for (int j = 0; j < N; j++) {
            if (dizi1[j] % 2 == 0) {
                System.out.println("2ye bölünen:" + dizi1[j]);
                sayac++;
            }
            carpım2= carpım2 * dizi1[j];
            toplam2 += dizi1[j];
        }

        System.out.println("bulduğunuz eleman sayısı:" + sayac);
        System.out.println("dizi elemanlarının toplamı:" + toplam2);
        System.out.println("dizi elemanlarının çarpımı:" + carpım2);
    }

}
