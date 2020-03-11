import javax.swing.*;
public class Soluçao3{
   public static void main (String [] args){
      
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      double elevado = Math.pow(numero, 2);
      
      JOptionPane.showMessageDialog(null, "O elevado eh: " + elevado);
      System.exit(0);
   }
}