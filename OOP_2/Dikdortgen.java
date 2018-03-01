package nyp.lab2;

public class Dikdortgen {

    int solust_x;
    int solust_y;
    int genislik;
    int yukseklik;

    public void Ciz() {
        System.out.print(" ");
        for (int i = 0; i < genislik; i++) {
            System.out.print("-");
        }
        System.out.println("");

        for (int i = 0; i < yukseklik; i++) {
            System.out.print("|");
            for (int j = 0; j < genislik; j++) {
                System.out.print(" ");

            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int i = 0; i < genislik; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public int alan() {

        int x = yukseklik * genislik;
        return x;

    }

    public String bilgiler() {
        String x = "sol üst köse:(" + solust_x + "," + solust_y + ") genislik : " + genislik + " yukseklik : " + yukseklik;
        return x;
    }

    public Boolean icinde_mi(int x, int y) {
       if(x<= genislik && y<= yukseklik)
               return true;
       else
           return false;
    }
}
