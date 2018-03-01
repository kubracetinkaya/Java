package nyp.lab13;

import java.awt.*;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import sun.awt.RepaintArea;



public class NYPLab13 extends mayinTarlasiOyunu {

protected int kareSayisi = 30;
protected int mayin = 0;
JFrame frame = new JFrame("Mayın Tarlası");





public class mayinYerlestirme extends mayinTarlasiOyunu implements ActionListener{

protected int boyut;
protected int mayinSayisi; 
JButton [][] button;
int[][] mayin;
int hak;





public void actionPerformed(ActionEvent e) {


JButton btn=(JButton)e.getSource();
Point point=getArrayLocation(btn);
if(mayin[point.x][point.y]<0){
button[point.x][point.y].setText(" "); 
oyunBitti();
}
else if(mayin[point.x][point.y]>0){
if(button[point.x][point.y].getActionCommand()=="doldur"){ 
if(mayin[point.x][point.y]==1){


button[point.x][point.y].setText(""+mayin[point.x][point.y]);
button[point.x][point.y].setOpaque(true);
button[point.x][point.y].setBackground(Color.YELLOW);
}
if(mayin[point.x][point.y]==2){
button[point.x][point.y].setText(""+mayin[point.x][point.y]);;
button[point.x][point.y].setOpaque(true);
button[point.x][point.y].setBackground(Color.GREEN);
}
if(mayin[point.x][point.y]==3){
button[point.x][point.y].setText(""+mayin[point.x][point.y]);
button[point.x][point.y].setOpaque(true);
button[point.x][point.y].setBackground(Color.RED);
}
if(mayin[point.x][point.y]>3) {
button[point.x][point.y].setText(""+mayin[point.x][point.y]);
button[point.x][point.y].setOpaque(true);
button[point.x][point.y].setBackground(Color.CYAN);
}
hak--;
if(hak==0)
JOptionPane.showMessageDialog(null,"Kazandın","Sonuc", JOptionPane.INFORMATION_MESSAGE);

} 
}
else if(mayin[point.x][point.y]==0){
kareAcma(point.x,point.y); 
}

}

public void oyunBitti(){


for(int i=0;i<mayin.length;i++){
for(int j=0;j<mayin.length;j++){
if(mayin[i][j]<0){
button[i][j].setText(" ");

button[i][j].setOpaque(true);
button[i][j].setBackground(Color.RED);

}
else if(mayin[i][j]==0){
button[i][j].setText(" ");
button[i][j].setOpaque(true);
button[i][j].setBackground(Color.WHITE);
}
else{
button[i][j].setText(""+mayin[i][j]);
if(mayin[i][j]==1){
button[i][j].setText(""+mayin[i][j]);
button[i][j].setOpaque(true);
button[i][j].setBackground(Color.yellow);
} 
if(mayin[i][j]==2){
button[i][j].setText(""+mayin[i][j]);
button[i][j].setOpaque(true);
button[i][j].setBackground(Color.GREEN);
} 
if(mayin[i][j]==3){
button[i][j].setText(""+mayin[i][j]);
button[i][j].setOpaque(true);
button[i][j].setBackground(Color.RED);
}
if(mayin[i][j]>3){
button[i][j].setText(""+mayin[i][j]);
button[i][j].setOpaque(true);
button[i][j].setBackground(Color.cyan);
}
}
} 
}
JOptionPane.showMessageDialog(null,"Kaybettiniz","Mayin",JOptionPane.INFORMATION_MESSAGE);
}


public void kareAcma(int x,int y){
if(x<0 || y<0 || x>button.length-1 ||y>button.length-1)
return;
if(button[x][y].getText()==" "){

if(mayin[x][y]>0){
if(mayin[x][y]==1){
button[x][y].setText(""+mayin[x][y]);
button[x][y].setOpaque(true);
button[x][y].setBackground(Color.yellow);
}
if(mayin[x][y]==2){
button[x][y].setText(""+mayin[x][y]);
button[x][y].setOpaque(true);
button[x][y].setBackground(Color.GREEN);
}
if(mayin[x][y]==3){
button[x][y].setText(""+mayin[x][y]);
button[x][y].setOpaque(true);
button[x][y].setBackground(Color.RED);
}
if(mayin[x][y]>3){
button[x][y].setText(""+mayin[x][y]);
button[x][y].setOpaque(true);
button[x][y].setBackground(Color.cyan);
}
hak--;
if(hak==0)
JOptionPane.showMessageDialog(null,"Kazandın", "Sonuc", JOptionPane.INFORMATION_MESSAGE);
}

if(mayin[x][y]==0){
button[x][y].setText(" ");
button[x][y].setOpaque(true);
button[x][y].setBackground(Color.WHITE);
hak--;
if(hak==0)
JOptionPane.showMessageDialog(null,"Kazandın", "Sonuc", JOptionPane.INFORMATION_MESSAGE);

kareAcma(x-1, y-1); kareAcma(x-1, y+1); kareAcma(x+1, y); kareAcma(x+1, y-1);
kareAcma(x-1, y); kareAcma(x, y+1); kareAcma(x, y-1); kareAcma(x+1, y+1);
}

} 
}

public Point getArrayLocation(JButton btn){
Point pt=new Point(-1, -1);
for(int j=0;j<button.length;j++){
for(int k=0;k<button[j].length;k++){
if(button[j][k]==btn){
pt.setLocation(j, k);
return pt;
}
}
}
return pt; 
}


public JPanel getContent(){

JPanel panel = new JPanel(new GridBagLayout());
GridBagConstraints gbc = new GridBagConstraints();
gbc.weighty = 1.0;
gbc.weightx = 1.0;
for(int j = 0; j < button.length; j++) {
for(int k = 0; k < button[j].length; k++) {
int n = j*button[j].length + k + 1;
button[j][k] = new JButton(" ");
button[j][k].addActionListener(this);
button[j][k].setActionCommand("doldur");
gbc.gridwidth = (k < button[j].length-1) ? 1 :GridBagConstraints.REMAINDER;
panel.add(button[j][k], gbc);
}
}
return panel;
}

public mayinYerlestirme(int boyut, int mayinSayisi){
this.boyut=boyut;
this.mayinSayisi=mayinSayisi;
button=new JButton[boyut][boyut]; 
mayin=new int[boyut][boyut]; 
hak=this.boyut*this.boyut-this.mayinSayisi;
Random rnd=new Random();
int x,y;
for(int i=0;i<mayin.length;i++){
for(int j=0;j<mayin.length;j++){
mayin[i][j]=0;
}
}

for(int j=0;j<mayinSayisi;j++){
x=rnd.nextInt(boyut);
y=rnd.nextInt(boyut);
if(mayin[x][y]<0){
j--;
continue;
}
mayin[x][y]=-100;
try{mayin[x-1][y]++;}catch(Exception e){}
try{mayin[x+1][y]++;}catch(Exception e){}
try{mayin[x][y-1]++;}catch(Exception e){}
try{mayin[x][y+1]++;}catch(Exception e){}
try{mayin[x-1][y-1]++;}catch(Exception e){}
try{mayin[x-1][y+1]++;}catch(Exception e){}
try{mayin[x+1][y-1]++;}catch(Exception e){}
try{mayin[x+1][y+1]++;}catch(Exception e){}
} 
}


}

public static void main(String[] args) {

NYPLab13 al = new NYPLab13();
al.GUI_Hazırla();

}
public void JPanel (){
JPanel Panel = new JPanel();
Panel.setVisible(true);


}
public void GUI_Hazırla() {

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinYerlestirme(10, 12).getContent());
frame.setSize(550, 450);
frame.setLocation(300, 100);
frame.setVisible(true);
frame.repaint();
frame.revalidate();

}
}
