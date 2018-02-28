package lab8;

import java.util.Scanner;


public class Lab8 {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] a={5,6,8,-2,12,9};
        diziYaz(a);
        diziSaga(a);
        diziSagaK(a,2);
        diziSola(a);
        diziYaz(a);
        diziSolaK(a,3);
        diziYaz(a);
        diziKayK(a,-2);
        System.out.println("3 birim sola kaydırılmış hali");
        diziYaz(a);
        
    
        
    }
 public static void diziSola (int [] d){
     int tmp=d[0];
     
     for (int i = 0; i < d.length-1; i++) {
         d[i]=d[i+1];
         
         
     }
d[d.length-1]=tmp;


   }
 
 public static void diziSaga (int [] dizi){
     int tmp=dizi[dizi.length-1];
     for (int i =dizi.length-2; i>=0; i--) {
         dizi[i+1]=dizi[i];
          
     }
     dizi[0]=tmp;
  
     
 }
 public static void diziSagaK(int []dizi,int k){
     for (int i = 0; i <k; i++) {
        diziSaga(dizi);
         
     }
     
 }
     public static void diziYaz(int [] d){
         for (int i = 0; i <d.length; i++) {
             if(i<d.length-1)
                 System.out.print(d[i]+ ",");
             
             
         else
                 System.out.println(d[i]);   
                 
         
     }
     }
         
         public static void diziSolaK(int [] dizi,int k){
             for (int i = 0; i <k; i++) {
                 diziSola(dizi);
                 
                 
                 
             }
         }
         
         public static void diziKayK (int []dizi, int k){
             if(k<0){
                 diziSolaK(dizi,-1*k);
             }
             if(k>0){
                 diziSagaK(dizi,k);
             }
         }
 
     
}
