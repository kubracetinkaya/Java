package nyp.lab4;

import java.util.Random;

public class mac {

    private takim takım1, takım2;
    private boolean oynandı;
    private int gol1, gol2;

    public mac(takim t1, takim t2) {
        takım1 = t1;
        takım2 = t2;
        oynandı = false;   
    }

    public takim getTakım1() {
        return takım1;
    }

    public takim getTakım2() {
        return takım2;
    }
    
    public boolean oynandı_mı() {
        return oynandı;
    }

    public int getGol1() {
        if (oynandı) {
            return gol1;
        } else {
            return -1;
        }
    }

    public int getGol2() {
        if (oynandı) {
            return gol2;
        } else {
            return -1;
        }
    }
    
    public void oyna0() {
        oynandı = true;
        Random rnd = new Random();
        gol1 = rnd.nextInt(4);
        gol2 = rnd.nextInt(4);
    }

    public void oyna() {
        oynandı = true;
        double t1 = (1 + takım1.getHücum() - takım2.getSavunma()) / 2;
        double t2 = (1 + takım2.getHücum() - takım1.getSavunma()) / 2;
        for (int i = 1; i <= 9; i++) {
            if (Math.random() < t1) {
                gol1++;
            }
            if (Math.random() < t2) {
                gol2++;
            }
            System.out.println("Dakika " + (i * 10) + " : " + gol1 + " : " + gol2);
        }
    }

    /*
     Evsahibi - misafir durumunu ve savunma/hücum değerlerini dikkate alan bir çözüm.
     evsahibi takımın hücum ve savunma değerleri belli oranda artırılır, misafirin düşürülür.
     */
    public void oyna1() {
        double t1_h = 1.2, t2_h = 0.8;  // evsahibi-misafir takım hücum artış/azalış çarpanları
        double t1_s = 1.2, t2_s = 0.8;  // evsahibi-misafir takım savunma artış/azalış çarpanları
        oynandı = true;
        double t1 = (1 + t1_h * takım1.getHücum() - t2_s * takım2.getSavunma()) / 2;
        double t2 = (1 + t2_h * takım2.getHücum() - t1_s * takım1.getSavunma()) / 2;
        for (int i = 1; i <= 9; i++) {
            if (Math.random() < t1) {
                gol1++;
            }
            if (Math.random() < t2) {
                gol2++;
            }
            // maçın ilerleyişini görmek için yazdırabiliriz. istemiyorsanız aşağıdaki satırı kapatın.
            System.out.println("Dakika " + (i * 10) + " : " + gol1 + " : " + gol2);
        }
    }

    public String toString() {
        String s = takım1.toString() + " : " + gol1 + " / " + takım2.toString() + " : " + gol2;
        if (!oynandı) {
            s += " (OYNANMADI)";
        }
        return s;
    }
}
