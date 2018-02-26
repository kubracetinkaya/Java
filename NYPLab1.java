package nyp.lab1;

import javax.swing.JOptionPane;

public class NYPLab1 {

    public static void main(String[] args) {
        kitap x = new kitap();

        System.out.println(x.baslik);
        System.out.println(x.baskiNo);
        System.out.println(x.fiyat);
        System.out.println(x.stokta);

        x.baslik = "ilk başlık";
        x.baskiNo = 5;
        x.fiyat = 12.5;
        x.stokta = true;

        System.out.println("kitabın başlığı:" + x.baslik);
        System.out.println("kaçıncı baskı:" + x.baskiNo);
        System.out.println("kitabın fiyatı:" + x.fiyat);
        System.out.println("stokta var mı:" + x.stokta);

        kitap y = new kitap();
        y.baslik = "yepyeni başlık";
        y.baskiNo = 3;
        y.fiyat = 10.5;
        y.stokta = false;

        System.out.println(y.baslik);
        System.out.println(y.baskiNo);
        System.out.println(y.fiyat);
        System.out.println(y.stokta);

        System.out.println(x.baslik);
        System.out.println(x.baskiNo);
        System.out.println(x.fiyat);
        System.out.println(x.stokta);

        x = y;
        System.out.println(x);
        System.out.println(y);

        kitap[] kitaplar = new kitap[3];
    /*
        kitaplar[0].baskiNo = 5;
        kitaplar[1].baskiNo = 3;
        kitaplar[2].baskiNo = 2;
*/
        yazar z = new yazar();

        z.kitap = y;

        System.out.println(z.kitap.baslik);

        JOptionPane.showMessageDialog(null, "mesaj1");
        JOptionPane.showMessageDialog(null, "mesaj2_question", "başlık",
                JOptionPane.QUESTION_MESSAGE);
        int cevap = JOptionPane.showConfirmDialog(null, "Onay");
        JOptionPane.showMessageDialog(null, "Cevap = " + cevap);
        String isim = JOptionPane.showInputDialog("Adınız:");
        JOptionPane.showMessageDialog(null, "Merhaba " + isim);

    }

}
