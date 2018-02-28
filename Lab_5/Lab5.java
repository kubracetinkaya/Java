
package javaapplication50;

import java.util.Scanner;


public class JavaApplication50 
{

    
    public static void main(String[] args)
    {  
         Scanner in = new Scanner(System.in);
        System.out.println("adet giriniz");
        int adet = in.nextInt();
        yıldızYazdır(adet);
        System.out.println("En giriniz");
        int en = in.nextInt();
        System.out.println("Boy giriniz");
        int boy = in.nextInt();
        dikdörtgen(en, boy);
         
        System.out.println("a sayısını giriniz");
        double a = in.nextDouble();
        
        System.out.println("b sayısını giriniz");
        double b = in.nextDouble();
        
        System.out.println("c sayısını giriniz");
        double c = in.nextDouble();
        
        System.out.println("x sayısını giriniz");
        double x=in.nextDouble();
        double sonuc = polinom(a,b,c,x);
        System.out.println("sonuc:"+sonuc);
        double dizi[] = polinom2(2, 3, 4);
    }

    public static void yıldızYazdır(int uzunluk) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("*");

        }
        System.out.println("");
    }


    public static void dikdörtgen(int en, int boy) {
        for (int i = 0; i < boy; i++) {
            yıldızYazdır(en);
        }
        System.out.println(" ");
    }
   

    public static double polinom(double a, double b, double c, double x) {

        double sonuç;
        sonuç = (a * x * x) + (b * x) + c;
        return sonuç;
    }
    
public static double[] polinom2(double a, double b,double c) {
    double x=-10;
  double[]dizi=new double[101];
  for(int i=0; i<101; i++){
      dizi[i]=polinom(a,b,c,x);
      System.out.println(i+":"+dizi[i]);
      x=x+0.2;
      
      
  }
  return dizi;
}
    
    
    }
