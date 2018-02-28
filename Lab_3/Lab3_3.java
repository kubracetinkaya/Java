
package lab3;

import java.util.Scanner;


public class lab3_3 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("birinci reel sayıyı giriniz");
        double r1 = in.nextDouble();
        System.out.println("ikinci reel sayıyı giriniz");
        double r2 = in.nextDouble();
        System.out.println("1-4 arasında bir işlem seçiniz");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        double k=in.nextDouble();
        if(k==1){
            System.out.println(r1+ "+" +r2+ "=" +(r1+r2));
        }
        if(k==2){
            System.out.println(r1+ "-" +r2+ "=" +(r1-r2));
        }
        if(k==3){
            System.out.println(r1+ "*" +r2+ "=" +(r1*r2));
        }
        if(k==4){
            System.out.println(r1+ "/" +r2+ "=" +(r1/r2));
        }
        
        
        
        

    }
}
