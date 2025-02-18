package Aula_3;

import javax.swing.*;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        System.out.println(circulo.getRaio());
        System.out.println(circulo.getArea()+ " unidades ²");
        System.out.println(circulo.getPerimetro());
        circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Novo Raio")));
        System.out.println(circulo.getRaio());
        System.out.println(circulo.getArea()+ " unidades ²");
        System.out.println(circulo.getPerimetro());
    }

}
