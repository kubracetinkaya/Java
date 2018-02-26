package nyp.lab5;

public class tarih {

    private int yıl, ay, gün;
    public static String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
    public static int[] ayGünSayıları = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public tarih(int gün, int ay, int yıl) {
        setTarih(gün, ay, yıl);
    }
    

    public boolean setYıl(int yıl) {
        if (yıl >= 1 && yıl <= 9999) {
            this.yıl = yıl;
            return true;
        } else {
            if (this.yıl == 0) {
                this.yıl = 2016;
            }
            return false;
        }
    }

    public boolean setAy(int ay) {
        if (ay >= 1 && ay <= 12) {
            this.ay = ay;
            return true;
        } else {
            if (this.ay == 0) {
                this.ay = 1;
            }
            return false;
        }
    }

    public boolean setGün(int gün) {
        if (gün >= 1 && gün <= buAyMaxGün()) {
            this.gün = gün;
            return true;
        } else {
            if (this.gün == 0) {
                this.gün = 1;
            }
            return false;
        }
    }

    public boolean setTarih(int gün, int ay, int yıl) {
        boolean r1 = setYıl(yıl);
        boolean r2 = setAy(ay);
        boolean r3 = setGün(gün);
        return r1 & r2 & r3;
    }

    public static boolean artıkyıl_mı(int yıl) {
        if (yıl % 400 == 0) {
            return true;
        }
        return (yıl % 4 == 0) && (yıl % 100 != 0);
    }

    public void ertesiGün() {
        gün++;
        if (gün > buAyMaxGün()) {
            gün = 1;
            ay++;
            if (ay > 12) {
                ay = 1;
                yıl++;
                if (yıl > 9999) {
                    yıl = 1;
                }
            }
        }
    }

    /*
     Mevcut ayın kaç çektiği bir kaç yerde kullanılıyor. 
     Bunu bir metot yapalım.
     */
    private int buAyMaxGün() {
        int maxGün = ayGünSayıları[this.ay - 1]; 
        if (this.ay == 1 && artıkyıl_mı(this.yıl)) {
            maxGün = 29; // artık yıl ve şubat ise düzeltme yap
        }
        return maxGün;
    }

    public int karşılaştır(tarih t) {
        if (yıl < t.yıl) {
            return -1;
        } else if (yıl > t.yıl) {
            return 1;
        } else {  // yıllar aynı, aya bak
            if (ay < t.ay) {
                return -1;
            } else if (ay > t.ay) {
                return 1;
            } else { // aylar da aynı, güne bak
                if (gün < t.gün) {
                    return -1;
                } else if (gün > t.gün) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public int arasıKaçGün(tarih t) {
        int k = karşılaştır(t);
//        System.out.println("t1:" + this.toString());
//        System.out.println("t2:" + t);
//        System.out.println("karşılaştır:" + k);

        if (k == 0) {
            return 0; // Tarihler eşit
        }
        tarih başla, bitiş;
        if (k == 1) {
            başla = new tarih(t.gün, t.ay, t.yıl);
            bitiş = this;
        } else {
            başla = new tarih(gün, ay, yıl);
            bitiş = t;
        }

//        System.out.println("Başla:" + başla);
        int say = 0;
        while (başla.karşılaştır(bitiş) < 0) {
            başla.ertesiGün();
            say++;
        }
        return say;
    }

    public int getYıl() {
        return yıl;
    }

    public int getAy() {
        return ay;
    }

    public int getGün() {
        return gün;
    }

    public String getAyAdı() {
        return aylar[ay - 1]; 
    }

    public String toString() {
        return gün + " " + getAyAdı() + " " + yıl;
    }

}
