
package nyp.lab8;

public class motorluTasit extends tasit implements Comparable  
{
   
    @Override
    public void tanit()
    {
        System.out.println("Ben motorlu taşıt " +motorHacmi);
    }
    double motorHacmi;
    
    public motorluTasit(double motorHacmi)
    {
      this.motorHacmi=motorHacmi;        
    }
    public motorluTasit()
    {
      this(1.6);
    }
    
    public int  compareTo(Object o) //?????
    {
       if(o == null || !(o instanceof motorluTasit))return 1;
       double m =((motorluTasit) o).motorHacmi;
       if(motorHacmi<m)
       {
           return -1;
       }
       else if(motorHacmi==m)
       {
           return 0;
       }
       else return 1;
    
    }
    
}

