package javaapplication50;

import java.util.Scanner;


public class JavaApplication50 
{

    
    public static void main(String[] args)
    {  
        Scanner in=new Scanner(System.in);
       int [ ] d = new int [4];
       int i;
       for(i=0; i<d.length; i++)
       {
           System.out.println("Eleman giriniz");
           d[i]=in.nextInt();
           
       }
      boolean sıralı = diziSıralıMı(d);
        if (sıralı) {
          System.out.println("Dizi sıralıdır.");
        }else
            System.out.println("Dizi sıralı değil.");
    
               }
  public static boolean diziSıralıMı(int []dizi){
      for (int i = 0; i <dizi.length-1; i++) {
         if(dizi[i]>dizi[i+1]){
             return false;
         }
         
          
          
      }
      return true;
      
     }}
