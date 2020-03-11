import javax.swing.*;
public class Soluçao4{
   public static void main(String [] args){
      
      String palavra1 = JOptionPane.showInputDialog("Digite uma palavra");
      String palavra2 = JOptionPane.showInputDialog("Digite uma palavra");
      String palavra3 = JOptionPane.showInputDialog("Digite uma palavra");
      
      int resultado = palavra1.length() + palavra2.length() + palavra3.length();
                
      JOptionPane.showMessageDialog(null, "O comprimento total eh: " + resultado);
      System.exit(0);
   }
}