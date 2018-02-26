
package lab2;

import java.util.Scanner;
public class Lab2 
{

    public static void main(String[] args) 
    {
      Scanner in=new Scanner(System.in);
        System.out.println("Javada program yazmaya giriş.");
        System.out.println("Program \"class\" ve \"method\"lardan oluşur");
        System.out.println("\"80li yıllar\",ve/veya,ve/veya." );
        System.out.println("**************************************");
        System.out.println("*********JAVA PROGRAMLAMA ************");
        System.out.println("**************************************");
        System.out.println("     J   A   V       V    A");
        System.out.println("     J  A  A  V     V    AA");
        System.out.println("  J  J AAAAA   V  V     AAAA");
        System.out.println("   JJ A      A  V      A    A");
        
        
        //soru 2
       
        System.out.println("Adınızı giriniz");
        String ad = in.next();
        System.out.println("Doğum yılınızı giriniz");
        int tarih=in.nextInt();
        int yas;
        yas=2015-tarih;
        System.out.println("Merhaba "  +ad+   +yas+ " yaşındasınız");
       
        //soru 3
        System.out.println("Birinci ürünün ismini giriniz");
        String u1=in.next();
        System.out.println("Birinci ürünün miktarını giriniz");
        double m1=in.nextDouble();
        System.out.println("Birinci ürünün birim fiyatını giriniz");
        double b1=in.nextDouble();
        double fiyat1=m1*b1;
        System.out.println("İkinci ürünün ismini giriniz");
        String u2=in.next();
        System.out.println("ikinci ürünün miktarını giriniz");
        double m2=in.nextDouble();
        System.out.println("İkinci ürünün birim fiyatını giriniz ");
        double b2=in.nextDouble();
        double fiyat2=m2*b2;
        System.out.println("Üçüncü ürünün ismini giriniz");
        String u3=in.next();
        System.out.println("Üçüncü ürünün miktarını giriniz");
        double m3=in.nextDouble();
        System.out.println("Üçüncü ürünün birim fiyatını giriniz");
        double b3=in.nextDouble();
        double fiyat3=m3*b3;
        double toplam=fiyat1+fiyat2+fiyat3;
        System.out.println("--------------------------------------------------");
        System.out.println("|  ürün  | miktar | birim fiyatı|ürün toplam |");
        System.out.println("--------------------------------------------------"); 
        System.out.println("|"+u1+"\t|"+m1+"\t|  "+b1+"\t   |"+fiyat1+"\t|");
        System.out.println("--------------------------------------------------");
        System.out.println("|"+u2+"\t|"+m2+"\t|  "+b2+"\t   |"+fiyat2+"\t|"); 
        System.out.println("--------------------------------------------------");
        System.out.println("|"+u3+"\t|"+m3+"\t|  "+b3+"\t   |"+fiyat3+"\t|");
        System.out.println("--------------------------------------------------");
        System.out.println("|GENEL TOPLAM:                  |"+toplam+    "\t| ");
        System.out.println("--------------------------------------------------");
        
        //soru 4
        System.out.println("Birinci kişinin ismi");
        String isim1=in.next();
        System.out.println("Birinci kişinin yaşı");
        int yaş1=in.nextInt();
        System.out.println("ikinci kişinin ismi");
        String isim2=in.next();
        System.out.println("ikinci kişinin yaşı");
        int yaş2=in.nextInt();
        System.out.println("üçüncü kişinin ismi");
        String isim3=in.next();
        System.out.println("üçüncü kişinin yaşı");
        int yaş3=in.nextInt();
        System.out.println("dördüncü kişinin ismi");
        String isim4=in.next();
        System.out.println("dördüncü kişinin yaşı");
        int yaş4=in.nextInt();
        int ortalama=(yaş1+yaş2+yaş3+yaş4)/4;
        int fark1=ortalama-yaş1;
        System.out.println( isim1 + " ortalamadan " + fark1 + " kadar büyüksün ");
        int fark2=ortalama-yaş2;
        System.out.println( isim2 + " ortalamadan " + fark2 + " kadar büyüksün ");
        int fark3=ortalama-yaş3;
        System.out.println( isim3 + " ortalamadan " + fark3 + " kadar büyüksün ");
        int fark4=ortalama-yaş4;
        System.out.println( isim4 + " ortalamadan " + fark4 + " kadar büyüksün ");
        
        
        
        
    }
    
}
