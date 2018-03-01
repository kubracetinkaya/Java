package javaapplication46;


public class JavaApplication46 
{

    
    public static void main(String[] args) 
    {
       //type casting from int to string
       int sayı1=9;
       String deger1=String.valueOf(sayı1);       
       String deger2=Integer.toString(sayı1);
       System.out.println(deger1+  " " +  deger2);
       
       //type casting from string to int
        String degisken="5";
        int yeni1=Integer.valueOf(degisken);
        int yeni2=Integer.parseInt(degisken);
        System.out.println(yeni1 + yeni2);
        
        //type casting from double to int 
        double sayi=371.8;
        int sayi1=(int)sayi;
        System.out.println(sayi1);
        
        //type casting from int to double
        int sayi2=371;
        double sayi3=(double)sayi2;
        System.out.println(sayi3);
        
        //type casting from float to long
        float sayi_=371.6f;
        long sayi1_=(long)sayi_;
        System.out.println(sayi1_);
        
        //type casting from long to float
        long sayii=371;
        float sayii1=(float)sayii;
        System.out.println(sayii1);
        
        //type casting from another type to string
        long a=456363;
        String deger1_=String.valueOf(a);
        String deger2_=Long.toString(a);
        System.out.println(deger1_+ " " +deger2_);
        
        float b=311.123f;
        String deger3=String.valueOf(b);
        String deger4=Float.toString(b);
        System.out.println(deger3+ " " +deger4);
        
        byte c=11;
        String deger5=String.valueOf(c);
        String deger6=Byte.toString(c);
        System.out.println(deger5+ " " +deger6);
       
    }
    
}
