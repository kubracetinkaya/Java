
package pkgif.pkgelse;

import java.util.Scanner;

public class IfElse {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("bir sayı giriniz");
//        double x=in.nextDouble();
//        if(x<0){
//            System.out.println("negatif sayı girdiniz");
//        }
//       else if(x>0){
//                  System.out.println("pozitif sayı girdiniz");
//                
//                }
//        else
//        System.out.println("sayınız sıfır");
//        
//        System.out.println("bir sayı giriniz");
//        double k=in.nextDouble();
//        if((k>=-10)&&(k<7)){
//            System.out.println("geçerli sayı girdiniz");
//           
//                    
//                    }
//        else
//            System.out.println("geçersiz sayı");

//        System.out.println("bir not giriniz");
//        double n = in.nextDouble();
//        if ((n <= 100) && (n >= 80)) {
//            System.out.println("notunuz AA");
//
//        }
//        if ((n < 80) && (n >= 60)) {
//            System.out.println("notunuz BB");
//        }
//        if ((n < 60) && (n >= 40)) {
//            System.out.println("notunuz CC");
//        } else if ((n < 40) && (n >= 20)) {
//            System.out.println("notunuz DD");
//        } else {
//            System.out.println("notunuz FF");
//        }
        System.out.println("a gir");
         int a=in.nextInt();
         System.out.println("b gir");
         int b=in.nextInt();
         System.out.println("c gir");
         int c=in.nextInt();
        if(a>b && a>c && b>c){
            System.out.println("a>b>c");
        }
        else if(a>b && a>c && c>b){
            System.out.println("a>c>b");
        }
        else if(b>a && b>c && a>c){
            System.out.println("b>a>c");
        }else if(b>a && b>c && c>a){
            System.out.println("b>c>a");
        }
          else if(b>a && b>c && a>c){
            System.out.println("b>a>c");
        }
        else if(c>a && c>b && a>b){
            System.out.println("c>a>b");
        }
         else{
            System.out.println("c>b>a");
        }
    }

}
