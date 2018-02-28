
package lab4;

import java.util.Scanner;


public class Lab4 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int a1 = in.nextInt();
        System.out.println("bir tam sayı daha giriniz");
        int a2 = in.nextInt();
        System.out.println("geçici temp sayısını giriniz");
        int temp = in.nextInt();
        temp = a1;
        a1 = a2;
        a2 = temp;
        System.out.println("yeni sayınız:" + a1);
        System.out.println("diğer yeni sayınız:" + a2);

        // b şıkkı
        System.out.println("1 ile 31 arasında bir gün giriniz");
        int gün = in.nextInt();
        if ((gün >= 1) && (gün < 31)) {
            System.out.println("doğru gün girdiniz");
        } else {
            System.out.println("yanlış gün tekrar girin");
        }
        System.out.println("1 ile 12 arasında bir ay giriniz");
        int ay = in.nextInt();
        if ((ay >= 1) && (ay < 31)) {
            System.out.println("doğru ay girdiniz");
        } else {
            System.out.println("yanlış ay tekrar girin");
        }
        System.out.println("1901 ile 2014 arasında bir yıl giriniz");
        int yıl = in.nextInt();
        if ((yıl >= 1901) && (yıl < 2014)) {
            System.out.println("doğru yıl girdiniz");
        } else {
            System.out.println("yanlış yıl girdiniz tekrar girin");
        }
        System.out.println(+gün + "/" + ay + "/" + yıl + "/");
        //c şıkkı
        System.out.println("bir gün giriniz");
        int gn=in.nextInt();
        switch (gn){
            case 1:System.out.println("1-pazartesi"); break;
            case 2:System.out.println("2-salı"); break;
            case 3:System.out.println("3-çarşamaba"); break;
            case 4:System.out.println("4-perşembe"); break;
            case 5:System.out.println("5-cuma"); break;
            case 6:System.out.println("6-cumartesi"); break;
            case 7:System.out.println("7-pazar"); break;
            default: System.out.println("geçersiz işlem");
        //d şıkkı
        int i = 0;
        while (i < 1000) {
            System.out.println(i);
            i = i + 13;

        }
        //e şıkkı
        int l=0;
        while(l>-1000){
            System.out.println(l);
            l=l-13;
        }
       // f şıkkı
        int x=2;
        int üs=1;
        while(x<10000){
            System.out.println("2 nin"+üs+ "nci kuvveti" +x);
            x=x*2;
            üs++;
        }
        //g şıkkı
        int k=2;
        while(k>0){
            k=k*k;
            System.out.println(k); 
            System.out.println("k nin int değerleri için sonuç"+k);
        }
        long y=3;
        while(y>0){
            y=y*y;
            System.out.println(y);
            System.out.println("y nin long değerleri için sonuç"+y);
            
        }
        
        
        
        

    }

    }}
