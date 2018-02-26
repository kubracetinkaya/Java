package nyp.lab8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NypLab8 {

    public static void main(String[] args) 
    {
        tasit[] tasitlar = {new tasit(), new motorluTasit(), new ticariTasit(), new kamyonet()};
        for (tasit t: tasitlar) 
        {
            System.out.println("--------------------------");
           t.tanit();
                   
            if (t instanceof tasit) 
            {
                System.out.println("Taşıt: EVET");
            }
            else
            System.out.println("Taşıt: ------");
            
             if (t instanceof motorluTasit) 
            {
                System.out.println("Motorlu Taşıt: EVET");
            }
            else
             System.out.println("MotorluTaşıt:------");
             
               if (t instanceof ticariTasit) 
            {
                System.out.println("TicariTaşıt: EVET");
            }
            else
               System.out.println("TicariTaşıt:--------");
               
                 if (t instanceof kamyonet) 
            {
                System.out.println("Kamyonet:EVET");
            }
            else
                 System.out.println("Kamyonet: --------");
                 
                 
                 if (t instanceof Comparable) 
            {
                System.out.println("Comparable:EVET");
            }
                 System.out.println("Comparable: --------");

        }
        motorluTasit[] motorluTasit=new motorluTasit[10];
        
        for (int i = 0; i < 10; i++) 
        {
           motorluTasit[i]=new  motorluTasit(Math.random()*10);        
      motorluTasit[i].tanit();
        
    }
        Arrays.sort(motorluTasit);
        System.out.println("Sıralandıktan sonra:" );
        
               for (int i = 0; i < 10; i++) 
        {
             
      motorluTasit[i].tanit();
        
    }
}}
