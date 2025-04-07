package main.principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class ExercicioTriangulo {

    public static void main(String[] args) {
        Triangulo tril = new Triangulo();
        
        tril.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base do triângulo:")));
        tril.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("digite a altura do triângulo:")));
  
        JOptionPane.showMessageDialog(null,"A área do triângulo é:" + tril.getArea());
        }
    }