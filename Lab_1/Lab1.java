
package lab1;

public class Lab1 
{

    public static void main(String[] args) 
    {
        int x=10;
        System.out.println("x=" +x);
        x=x+1;
         System.out.println("x=" +x);
        x=x+10;
         System.out.println("x=" +x);
        x=x-5;
         System.out.println("x=" +x);
        x=x*6;
         System.out.println("x=" +x);
        x=x/2;
         System.out.println("x=" +x);
         
        
         int a,b,c;
         a=25;
         System.out.println(a);
         b=a/10;
         System.out.println(b);
         c=a/20;
         System.out.println(c);
         
         float z,y;
         z=a/10;
         y=a/20;
         System.out.println(z);
         System.out.println(y);
        
         
         float f;
         f=0.000001f;   //float olduğu için sonuna f yazmalısınız, yoksa Java ondalıklı sayıları hep double olarak yorumlar
         System.out.println(f);  
                    
         
          double pi=3.14;
        double r=4;
        double h=8;
        double cevre=2*pi*r;
        System.out.println("çevre=" +cevre);
         double alan=pi*r*r;
        System.out.println("alan=" +alan);
        double hacim=(pi*r*r*h);
        System.out.println("hacim=" +hacim);
        double yuzey=(2*pi*r*r)+(2*pi*r*h);
        System.out.println("yuzey=" +yuzey);
       

         
         
         
         
    }

}
