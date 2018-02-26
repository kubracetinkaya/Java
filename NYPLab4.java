package nyp.lab4;

public class NYPLab4 {

    public static void main(String[] args) {

        takim t1 = new takim("Galatasaray");
        System.out.println("Takım 1: " + t1);

        takim t2 = new takim("Fenerbahçe", 0.9, 0.2);
        System.out.println("Takım 2: " + t2);

        mac m = new mac(t1, t2);
        System.out.println("Maç1 (önce): " + m);
        m.oyna();
        System.out.println("Maç1 (sonra): " + m);

        System.out.println("LİG:");
        takim t3 = new takim("Kayseri", 0.2, 0.6);

        lig lig = new lig(t1, t2, t3);
        lig.oyna();

    }

}
