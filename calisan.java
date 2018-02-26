package nyp.lab7;

import java.util.Date;

public class calisan extends kisi {

    int çalıştığıYıl;

    public calisan(String ad) {
         this(ad,"",new Date(1990,1,0),2);
    }

    public calisan(String ad, String email, Date doğum, float gano) {
        super(ad);
    }

    public int maas() {
        return 2000 + kıdemFarkı();
    }

    protected int kıdemFarkı() {
        return çalıştığıYıl * 100;
    }
        
   @Override
    public String toString()
    {
     
      return super.toString()+  "çalışan:"   +maas();
      
    }

}
