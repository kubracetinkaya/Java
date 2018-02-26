package nyp.lab4;

public class lig {

    private takim[] takımlar;
    private mac[] maçlar;
    private boolean oynandı;

    public lig(takim t1, takim t2, takim t3) {
        takımlar = new takim[3];
        takımlar[0] = t1;
        takımlar[1] = t2;
        takımlar[2] = t3;

        maçlar = new mac[3];
        maçlar[0] = new mac(t1, t2);
        maçlar[1] = new mac(t1, t3);
        maçlar[2] = new mac(t2, t3);

        oynandı = false;
    }

    public void oyna() {
        for (int i = 0; i < maçlar.length; i++) {
            maçlar[i].oyna();
            System.out.println(i);
            System.out.println(maçlar[i]);
        }
        oynandı = true;
    }

}
