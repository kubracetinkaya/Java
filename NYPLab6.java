
package nyp.lab6;

public class NYPLab6 {

  
    public static void main(String[] args) 
    {
        System.out.println("\n--------a---------");
        ustSınıf ust=new ustSınıf();
        ust.x=5;
        System.out.println(ust.x);
        altSınıf alt=new altSınıf();
        alt.x=7;
        System.out.println(alt.x);
        alt.y=9;
        System.out.println(alt.y);
        
        System.out.println("\n-------b----------");
        ust.metot1();
        alt.metot1();
        alt.alt_metot1();
        
        System.out.println("\n-------c-----------");
        alt.metot1();
        
        System.out.println("\n-------d-----------");
        ust.metot2();
        alt.metot2();
        
        System.out.println("\n-------e------------");
        alt.metot3();
        
        System.out.println("\n-------f------------");
        alt.metot4();
        
        System.out.println("\n-------g------------");
        System.out.println(ustSınıf.st);
        System.out.println(altSınıf.st);
        altSınıf.st=3;
        System.out.println(ustSınıf.st);
        System.out.println(altSınıf.st);
        
        System.out.println("\n-------h------------");
        ustSınıf ust2 = new altSınıf();
        ust2.metot1();
        ust2.metot2();

 // bu nesneye şimdi de AltSınıf gözüyle bakalım
        altSınıf alt2 = (altSınıf) ust2;
        System.out.println("cast'ten sonra:");
        alt2.metot1();
        alt2.metot2();
        alt2.metot3();
        alt2.metot4();
 // ((AltSınıf) ust2).metot4() vs. de kullanılabilir
    }
    
}
