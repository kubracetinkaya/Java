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
public class lab3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("((a*x*x)+(b*x)+c) polinomunda a katsayısını giriniz");
        double a = in.nextDouble();
        System.out.println("b kat sayısını giriniz");
        double b = in.nextDouble();
        System.out.println("c kat sayısını giriniz");
        double c = in.nextDouble();
        double delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("denklemin kökü yoktur");
        }
        if (delta == 0) {
            System.out.println("çakışık iki kökü vardır (x1=x2)");
        }

        if (delta > 0) {
            System.out.println("iki farklı kök vardır");
        }

    }
}
