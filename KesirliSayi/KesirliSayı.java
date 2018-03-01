package kesirli.sayı;

public class KesirliSayı {

    public static void main(String[] args) {
        kesirli x, y;
        x = new kesirli();
        y = new kesirli();

        x.pay = 8;
        x.payda = 16;
        
        x.yaz();

        y.pay = 8;
        y.payda =4;
        y.yaz();
        x.ekle(y);
        System.out.println(y + " eklenince = " + x);
        
        x.carp(2);
        System.out.println("2 ile çarpınca = " + x);
        x.sadelestir();
        System.out.println("sadeleştirince: " + x);
        

    }

    public static void Ornek1() {
        

        kesirli z = new kesirli(14,7);
        z.yaz();
        }
            public static void Ornek2()
            {
                double toplam=0;
                int payda=2;
                for (int i = 0; i < 100; i++) 
                {
                    double a=1.0/payda;
                    toplam+=a;
                    payda*=2;
                    System.out.println(i+ ":" +payda+ ":" +a+ "=" +toplam );
                }
                
            }
    }

