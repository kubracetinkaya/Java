package operations;

import java.util.Scanner;


public class Operations 
{

    
    public static void main(String[] args)
    {
 // swapping

  int a=5;
  int b=10;
  int temp;
  temp=a;
  a=b;
  b=temp;
    System.out.println("a'nın değeri " +a);
    System.out.println("b'nin değeri " +b);

  Scanner in=new Scanner(System.in);
        System.out.println("Bir c sayısı giriniz");
        int c=in.nextInt();
        System.out.println("Bir d sayısı giriniz");
        int d=in.nextInt();
        
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("Yeni c " +c);
        System.out.println("Yeni d " +d);
        
        

    }
    
}
