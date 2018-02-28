import java.util.Scanner;


public class JavaApplication50 
{

    
    public static void main(String[] args)
    {  
        
         Scanner in = new Scanner(System.in);
        String[] iller = new String[82];
        int plaka;
        String il;

        System.out.println("1-81 arasında plaka giriniz");
        plaka = in.nextInt();
        while ((plaka >= 1) && (plaka <= 81)) {
            if (iller[plaka] == null) {
                System.out.println("plaka yok bir il giriniz.bilmiyorsanız - giriniz");
                il = in.next();
                if (il.equals("-")) {
                    System.out.println(plaka + " plakalı il kaydedilmedi");
                } else {
                    iller[plaka] = il;
                    System.out.println(iller[plaka] + " sisteme eklendi.teşekkür ederim");

                }

            } else {
                System.out.println(iller[plaka]);
            }
            System.out.println("yeni bir plaka giriniz");
            plaka = in.nextInt();

        }
        System.out.println("girdiğiniz sayı geçersizdir...");
    }
}

        
        
        
    
    




