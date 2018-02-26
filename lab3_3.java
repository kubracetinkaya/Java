/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class lab3_3 {

    /**
     * @param args the command line arguments
     */
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
