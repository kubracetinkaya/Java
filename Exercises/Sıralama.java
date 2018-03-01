public class JavaApplication45
{

    
    public static void main(String[] args)
    
   {
        Scanner in=new Scanner(System.in);
        System.out.println("a değerini giriniz");
       int a;
        a=in.nextInt();
        Integer b=new Integer(a);
        System.out.println("k değerini sayı giriniz");
        int k=6;
        k=in.nextInt();
        
        
        if(a>k)
        {
        System.out.println("a>k");
        }
        else if(k>a)
             System.out.println("k>a");
        else
            System.out.println("=");
        
        
        int y=b.intValue();
        System.out.println(y);
        System.out.println(k);
}}
