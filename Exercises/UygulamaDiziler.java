
package uygulama.diziler;

import java.util.Scanner;


public class UygulamaDiziler {


    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        
//     System.out.println("dizinin eleman sayısını giriniz");
//       int  N = in.nextInt();
//        int[] dizi1 = new int[N];
//       double[] dizi2 = new double[N];
//        String[] dizi3 = new String[N];
//        dizi3[0] = "fatma";
//        dizi3[N - 1] = "kübra";
//        System.out.println(dizi3[0] + " " + dizi3[N-1]);
        
        
        
//        int i=0;
//        for (double j =1; j <=N; j++) { 
//            dizi2[i]=Math.sqrt(j);
//            System.out.println(dizi2[i]);
//            i++;
//            
//        }
        
//      double max=dizi2[0];
//      double min=dizi2[0];
//        for (int j =1; j <N; j++) {
//            if(dizi2[j]>max){
//                max=dizi2[j];
//            }
//            if(dizi2[j]<min){
//                min=dizi2[j];
//            }
//        }
//        System.out.println("dizinin en küçük elemanı: "+min);
//        System.out.println("dizinin en büyük elemanı: "+max);
        
        
          Scanner oku = new Scanner(System.in);
        System.out.println("Dizilerin eleman sayısını giriniz");
        int N = oku.nextInt();
        
        int[] dizi1 = new int[N];
        double[]dizi2 = new double[N];
        String[] dizi3 = new String[N];
        
        dizi3[0] = "Merhaba";
        dizi3[N - 1] = "Nasılsın";
        System.out.println(dizi3[0] + " " + dizi3[N - 1]);
        System.out.println("---------------------------");
        
        
        int i = 0;
        for(double j = 0; j < N; j++)
        {
            dizi2[i] = Math.sqrt(j);
            System.out.println(dizi2[i]);          
        }
        
        
        double max = dizi2[0];
        double min = dizi2[0];
        for(int j = 1; j < N; j++)
        {
            if(dizi2[j] > max) max = dizi2[j];
            
            if(dizi2[j] < min) min = dizi2[j];
        }
        System.out.println("Dizinin En Küçük Elemanı= "+ min);
        System.out.println("Dizinin En Büyük Elemanı= "+ max);
        
        
        for(int a = 0; a < N; a++)
        {
            int r = (int) (Math.random()*100);
            dizi1[a] = r;
        }
        
        System.out.println("-----------------------------");
        System.out.println("Dizinin Elemanlarının Toplamı");
        int toplam = 0;
        for(int a = 0; a < N; a++)
        {
            if(a < N - 1) System.out.print(dizi1[a] + " + ");
            else System.out.print(dizi1[a]);
            toplam += dizi1[a];
        }
        System.out.println(" = " + toplam);
        System.out.println("");
        
      
        System.out.println("-----------------------------");
        System.out.println(N + " Değerine Tam Bölünenler:");
        int sayac = 0;
        int carpım = 1;
        for(int j = 0; j < N; j++)
        {
            if(dizi1[j] % 5 == 0)
            {
                sayac++;
                System.out.println(dizi1[j]);
                carpım = carpım * dizi1[j];
            }
        }
        System.out.println("Çarpım = " + carpım);
    }
   
}



