package nyp.lab7;

import java.util.Date;

public class ogrenci extends kisi 
    {
    float gano;
    
    public ogrenci(String ad)
    {
       super(ad);
       
    }
    
    public ogrenci(String ad,String email,Date doğum,float gano)
    {
        super(ad,email,doğum);
        this.gano=gano;
    }
    
      
    @Override
    public String toString()
    {
      
      return super.toString()+"öğrenci:"   +gano;
      
    }
}
