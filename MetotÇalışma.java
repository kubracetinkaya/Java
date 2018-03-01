
package metot.çalışma;

public class MetotÇalışma {

   
    public static void main(String[] args) {
        uzunYaz();

        uzunYaz2(2);

        double[] dizi = new double[5];
        for (int i = 0; i < 5; i++) {
            dizi[i] = (Math.random() * 100);
            System.out.println(dizi[i]);

        }
        System.out.println("");
        System.out.println("toplam:" + diziTopla(dizi));
        takas1_N(dizi);
    }

    public static void uzunYaz() {
        for (int i = 0; i < 40; i++) {
            System.out.print("* ");

        }

    }

    public static void uzunYaz2(int N) {

        for (int i = 1; i < N; i++) {
            System.out.println("*");

        }
        System.out.println("");

    }

    public static double diziTopla(double[] dizi) {
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];

        }
        return toplam;

    }

    public static void takas1_N(double[] dizi) {
        System.out.println("ilk durumda birinci eleman:" + dizi[0]);
        System.out.println("ilk durumda son eleman:" + dizi[dizi.length - 1]);

        double temp = dizi[0];
        dizi[0] = dizi[dizi.length - 1];
        dizi[dizi.length - 1] = temp;

        System.out.println("takas sonrası birinci eleman:" + dizi[0]);
        System.out.println("takas sonrası son eleman:" + dizi[dizi.length - 1]);
    }
}
