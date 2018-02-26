package nyp.lab7;

public class NYPLab7 {

    public static void main(String[] args) {
        kisi k = new kisi( "kübra" );
        System.out.println(k.toString());
        
        kisi k2 = new kisi( "gökhan" );
        System.out.println(k2.toString());

        ogrenci o1 = new ogrenci( "ahmet" );
        System.out.println(o1.toString());

        ogrenci o2 = new ogrenci( "mehmet" );
        System.out.println(o2.toString());
        
        calisan c1=new calisan( "ali" );
        System.out.println(c1.toString());
        
        calisan c2=new calisan( "veli" );
        System.out.println(c2.toString());
        
        akademik a1=new akademik("ayşe");
        System.out.println(a1.toString());
        
        akademik a2=new akademik("fatma");
        System.out.println(a2.toString());
    }

}
