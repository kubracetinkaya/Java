package javaapplication50;

import java.util.Scanner;


public class JavaApplication50 
{

    
    public static void main(String[] args)
    {  
        String cümle = "Hello world";
        System.out.println("orjınal:" + cümle);

        String kodlar = sifrele(cümle, 5);
        System.out.println("kodlanan:" + kodlar);
        String çözülmüş = sifrele(kodlar, -5);
        System.out.println("çözülmüş:" + çözülmüş);

    }

    public static String sifrele(String cumle, int s) {
        String kHarfler = "abcçdefgğhıijklmnoöprsştuüvyz";
        String yCümle = " ";
        for (int i = 0; i < cumle.length(); i++) {
            char tmp = cumle.charAt(i);
            int index = kHarfler.indexOf(tmp);

            if (index == -1) {
                yCümle += tmp;

            } else {
                index = index + s;
                index = index % kHarfler.length();

                if (index < 0) {
                    index = index + kHarfler.length();

                }
                yCümle += kHarfler.charAt(index);
            }
        }
        return yCümle;

    }
}

     
