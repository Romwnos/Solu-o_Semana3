import javax.swing.*;
public class Soluçao1{
   public static void main(String [] args){
      
      int idade;
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
      
      int dias = idade * 365;
      
      JOptionPane.showMessageDialog(null, "Voce viveu aprocimadamente" + dias + "dias");
      System.exit(0);
   }
}