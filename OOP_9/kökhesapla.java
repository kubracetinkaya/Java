
package nyp.lab9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.SwingConstants.TOP;

public class kökhesapla implements ActionListener
{
    
    private JLabel yazı;
    private int s1,s2;
    Button[] tuslar;

public kökhesapla()
{
    
    s1=0; s2=0;
    Font fon1=new Font("Courier" ,Font.BOLD,40);
    
    

    
    yazı=new JLabel("0");
    yazı.setFont(fon1);
    yazı.setBackground(Color.white);
    yazı.setOpaque(true);
    yazı.setHorizontalAlignment(RIGHT);
    
    
    JFrame pencere=new JFrame("HESAP MAKİNESİ");
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setVisible(true);
    pencere.add(yazı,BorderLayout.NORTH);
    
    
    
    JPanel butonPanel=new JPanel();
    butonPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    butonPanel.setOpaque(true);
    pencere.setSize(1500, 500);
    pencere.setVisible(true);
   
    
    JPanel TusPaneli=new JPanel();
 
    
    TusPaneli.setLayout(new GridLayout(4,4));
    String[] numListe ={"7","8","9","4","5","6","1","2","3",".","0"};
    tuslar=new Button[numListe.length];
      
    for (int i = 0; i < numListe.length; i++) 
    {
         tuslar[i]=new Button(numListe[i]);
        tuslar[i].setFont(fon1);
        tuslar[i].addActionListener(this);
        TusPaneli.add(tuslar[i]); 
    }
   
    pencere.add(yazı,BorderLayout.NORTH);
    pencere.add(TusPaneli,BorderLayout.CENTER);
    pencere.setSize(300,300);  
           
        }
   
              

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() instanceof JButton)
        {
            
        
        JButton nur =(JButton)e.getSource();
        yazı.setText("" +Math.sqrt(s1));
        String text=nur.getText();
        
        Double d=Double.parseDouble(yazı.getText());
      
        }
        
        
        
        
        

        
        
        
        
        
    }
}

   
    




