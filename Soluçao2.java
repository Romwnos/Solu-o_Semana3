import javax.swing.*;
public class Soluçao2{
   public static void main(String [] args){
      
      double base;
      double altura;
      
      base = Double.parseDouble(JOptionPane.showInputDialog("De a base do solido"));
      altura = Double.parseDouble(JOptionPane.showInputDialog("De a altura do solido"));
      
      double area = base * altura;
      
      JOptionPane.showMessageDialog(null, "A area do solido eh: " + area);
      System.exit(0);
   }
}