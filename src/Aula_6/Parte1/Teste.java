package Aula_6.Parte1;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        String[] options1 = {"Quadrado","Circulo","Triangulo"};
        String[] options2 = {"Sair","Realizar operações novamente"};

        while (true){

            int opcao1 = JOptionPane.showOptionDialog(null,"Escolha a forma geometrica","Calculadora formas geometricas",0,2,null,options1,options1[0]);

            if(opcao1 == 0){
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do Quadrado"));
                Quadrado quadrado = new Quadrado(lado);

                JOptionPane.showMessageDialog(null,quadrado.toString());
                JOptionPane.showMessageDialog(null,"Area: " + quadrado.getArea());
                JOptionPane.showMessageDialog(null,"Perimetro: " + quadrado.getPerimetro());

            }else if(opcao1 ==1){
                int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio do circulo"));
                Circulo circulo = new Circulo(raio);

                JOptionPane.showMessageDialog(null,circulo.toString());
                JOptionPane.showMessageDialog(null,"Area: " + circulo.getArea());
                JOptionPane.showMessageDialog(null,"Perimetro: " + circulo.getPerimetro());
            }else {
                int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado A do triangulo"));
                int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado B do triangulo"));
                int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado C do triangulo"));


                Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC);

                JOptionPane.showMessageDialog(null,triangulo.toString());
                JOptionPane.showMessageDialog(null,"Area: " + triangulo.getArea());
                JOptionPane.showMessageDialog(null,"Perimetro: " + triangulo.getPerimetro());

            }

            int opcao2 = JOptionPane.showOptionDialog(null,"Deseja realizar mais operações ou sair","Calculadora formas geometricas",0,2,null,options2,options2[0]);

            if(opcao2 == 0){
                break;
            }
        }
    }
}
