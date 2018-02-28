
package lab3;

import java.util.Scanner;

public class Lab3 {

  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("bir reel sayı giriniz");
        double x = in.nextDouble();
       if (x == 2015) {
           System.out.println("doğru yılı girdiniz");
       }
      if (x < 0) {
          x = x * -1;
            System.out.println(x);
       }
       if ((x >= 0) && (x < 1)) {
           System.out.println("birden küçük bir pozitif sayı girdiniz");
       } else {
           System.out.println("sayı[0,1)aralığında değil");
       }
       if ((x < -50) || (x == 10) || (x >= 100) && (x <= 200)) {
            System.out.println("sayı geçerli");
       } else {
           System.out.println("sayı geçersiz");
       }
     int a,b,c;
    }

}
