
package uygulama.değşikenlerve.pkgif;

import java.util.Scanner;


public class UygulamaDeğşikenlerveIf {


    public static void main(String[] args) {
        
       Scanner in=new Scanner(System.in);
//        System.out.println("bir tam sayı giriniz");  
//        int a=in.nextInt();
//        if(a>0){
//            System.out.println("sayınız pozitif");
//        }
//        else if(a<0){
//            System.out.println("sayınız negatif");
//        }
//        else
//            System.out.println("sayı sıfır");
//        
//        
//        System.out.println("bir sayı giriniz");
//        double x=in.nextDouble();
//        if((x>-10)&&(x<=7)){
//            System.out.println("sayınız geçerli");
//        }
//        else
//            System.out.println("sayı geçersiz");
//        
//        
//        System.out.println("bir not giriniz");
//        double n=in.nextDouble();
//        if((n<=100)&&(n>=80)){
//            System.out.println("notunuz AA");
//        }
//        else if((n<80)&&(n>=60)){
//            System.out.println("notunuz BB");
//        }
//        else if((n<60)&&(n>=40)){
//            System.out.println("notunuz CC");
//        
//    }
//        else if((n<40)&&(n>=20)){
//            System.out.println("notunuz DD");
//        }
//        else{
//            System.out.println("notunuz FF");
//    
//}
        System.out.println("k sayısı giriniz");
        int k=in.nextInt();
        System.out.println("l sayısı giriniz");
        int l=in.nextInt();
        System.out.println("m sayısı giriniz");
        int m=in.nextInt();
        if((k>l)&&(k>m)&&(m>l)){
            System.out.println("k>m>l");
        }
        else if((k>l)&&(k>m)&&(l>m)){
            System.out.println("k>l>m");
       
    }
        else if((l>k)&&(l>m)&&(m>k)){
            System.out.println("l>m>k");
        }
        else if((l>k)&&(l>m)&&(k>m)){
            System.out.println("l>k>m");
        }
        else if((m>k)&&(m>l)&&(l>k)){
            System.out.println("m>l>k");
        }
        else{
            System.out.println("m>k>l");}
    
       String isim="kübra";
        System.out.println("merhaba"+isim);
        double pi=3.14;
        System.out.println("bir tam sayı giriniz");
        int x=in.nextInt();
        int a=5, b;
        double s=1/3d;
        System.out.println("bir tam sayı giriniz");
        int t=in.nextInt();
        double sonuç=(m*m+2*m+5);
        System.out.println("sonucunuz"+sonuç);
        
       double p=(5.73*2.05)+3.2-((7.4)/(1.6));
       
       double n=(5.15-2.71)*(3.4+11.01);
       double sonuc1=p/n;
        System.out.println("sonucunuz"+sonuc1);
       

       
    }}
        
        
