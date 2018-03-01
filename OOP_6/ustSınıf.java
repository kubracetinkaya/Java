
package nyp.lab6;


public class ustSınıf
{
    int x;
     static int st=1;
    
    public void metot1()
    {
        System.out.println("metot1(). tanım yeri: ustSınıf");
    }
    
    public void metot2()
    {
        System.out.println("metot2(). tanım yeri:ustSınıf.metot1 i çağırır");
        metot1();
    }
   
}
