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
public class lab3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("sayı çifttir");
        } else {
            System.out.println("sayı tektir");
        }
        if (x % 3 == 0) {
            System.out.println("sayı 3ün katıdır");
        } else {
            System.out.println("sayı 3ün katı değildir");
        }
        if ((x % 2 != 0) && (x % 3 == 0)) {
            System.out.println("sayı 2nin katı değil ama 3ün katı");

        } else if ((x % 3 != 0) && (x % 2 == 0)) {
            System.out.println("sayı 3ün katı değil ama 2nin katı");
        } else if ((x % 2 == 0) && (x % 3 == 0)) {
            System.out.println("sayı 6nın katı");
        } else if ((x % 3 != 0) && (x % 2 != 0)) {
            System.out.println("sayı 2 ve 3e bölünmez");
        }

    }

}
