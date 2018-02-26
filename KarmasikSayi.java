
package karmasik.sayi;

public class KarmasikSayi 
{
    
    public static void main(String[] args) 
    {
     karmasik x,y;
     
     x=new karmasik();
     x.reel=5;
     x.imajiner=3.5;
     
     y=new karmasik();
     y.reel=8;
     y.imajiner=9.5;
        System.out.println("x in reel kısmı:" +x.reel);
        System.out.println("y nin reel kısmı:" +y.reel);
 
     
        System.out.println("x in imajiner kısmı:" +x.imajiner);
        System.out.println("y nin imajiner kısmı:" +y.imajiner);
        karmasikYaz(x);
      
        yaz(y);
    }
        public static void karmasikYaz(karmasik x)
        {
             System.out.println("x:" +x.reel+ "+" +x.imajiner+ "i"); 
        }
        public static void yaz(karmasik y)
        {
            System.out.println("y:" +y.reel+ "+" +y.imajiner+ "i");
        }
   
    
}
