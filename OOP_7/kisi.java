package nyp.lab7;

import java.util.Date;

public class kisi {

    private String ad;
    private String email;
    private Date doğum;
    private static int kişiSayısı = 0;


    public kisi(String ad) {
        
        this(ad, " ", new Date(1990, 0, 1));

    }
   
    public kisi(String ad, String email, Date doğum) {
        this.ad = ad;
        this.email = email;
        this.doğum = doğum;
        kişiSayısı++;
    }

    public static int getkişiSayısı() {
        return kişiSayısı;
    }

    @Override
    public String toString() {
        return "KişiBilgileri:"  + ad + " " + email + " " + doğum+  "kişi sayısı:"  +getkişiSayısı();
    }

}
