
package nyp.lab7;

public class akademik extends calisan
{ 
    public akademik(String ad){
        super(ad);
    }
    
    @Override
    protected int kıdemFarkı()
    {
        return 1000;
    }
}
