
package nyp.lab3;

import java.util.Random;
import java.util.Scanner;

public class tahminOyunu 
{
    int hedefSayı;
    int tahmin;
    int tahminSayı;
    int eniyiskor;
    
    
    public void sayıTut()
    {
        Scanner in=new Scanner(System.in);
        Random rand = new Random();
        hedefSayı = rand.nextInt(100) + 1;
        //System.out.println("Tuttuğunuz sayı:" +hedefSayı);    
    }
        public int tahminYap(int a)
        {

            if(hedefSayı<a)
            {
                 return 1;
            }
            else if(hedefSayı>a)
            {
                return -1;
            }
            else
                return 0;
        }
        public void oyunaBasla()
        {
           Scanner in=new Scanner(System.in) ;
           int oyun=1;
           int eniyiskor=100;
           int sayac=1;

               System.out.println("Bir sayı giriniz");
               int a=in.nextInt();
               int k=tahminYap(a);
           
           while(k!=0)
           {
              if(k==-1)
                   {
                       
                   
                   System.out.println("Girdiğiniz sayı tahminden küçük. Tekrar giriniz");
                   a=in.nextInt();
                   k=tahminYap(a);
                   sayac++;
                   } 
                   else if(k==1)
                   {
                       
                   
                   System.out.println("Girdiğiniz sayı tahminden büyük. Tekrar giriniz");
                   a=in.nextInt();
                   k=tahminYap(a);
                   //System.out.println(k);
                   sayac++;
                   }        
                   
                   
               }
           if(sayac<=eniyiskor)
                     {
                         eniyiskor=sayac;
                     }
                     System.out.println("TEBRİKLER!" +sayac+ "denemede buldunuz");
                     System.out.println("Oyunun en iyi skoru:" +eniyiskor);
                     System.out.println("");
           
                   
              
           }
        }
        
        