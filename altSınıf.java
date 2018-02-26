
package nyp.lab6;

public class altSınıf extends ustSınıf
{
    int y;
       public void alt_metot1()
       {
           System.out.println("alt_metot1(). tanım yeri:altSınıf");
       }   
    @Override
       public void metot1()
       {
           System.out.println("metot1().tanım yeri:altSınıf(override)");
       }
    @Override
       public void metot2()
       {
           System.out.println("metot2(). tanım yeri:altSınıf(override).metot1 i çsğırır");
           metot1();
       }
       public  void metot3()
       {
            System.out.println("metot3(). tanım yeri:altSınıf. super.metot1 i çsğırır");
            super.metot2();
       }
        public  void metot4()
        {
            System.out.println("metot4(). tanım yeri:altSınıf. super.metot2 i çsğırır");
            super.metot2();
        }
        
}
    

