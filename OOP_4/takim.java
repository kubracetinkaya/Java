package nyp.lab4;

public class takim {

    private String isim;
    private double savunma, hücum;

    public takim(String s) {
        this(s, 0.5, 0.5);
    }

    public takim(String s, double sav, double huc) {
        isim = s;

        setSavunma(sav);
        setHücum(huc);
    }

    private double kontrol(double x) {
        if (x > 1) {
            return 1;
        }
        if (x < 0) {
            return 0;
        }
        return x;
    }

    public void setSavunma(double sav) {

        savunma = kontrol(sav);

        //kontrol(sav)=?
    }

    public double getSavunma() {
        return savunma;
    }

    public void setHücum(double huc) {
        hücum = kontrol(huc);
    }

    public double getHücum() {
        return hücum;
    }

    public String getİsim() {
        return isim;
    }

    public String toString() {
        return isim + " (S:" + savunma + " / H:" + hücum + ")";
    }
}
