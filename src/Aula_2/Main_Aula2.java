package Aula_2;

import javax.swing.*;

public class Main_Aula2 {



    public static void main(String[] args) {
        Data data = new Data();

        data.setAno(Integer.parseInt(JOptionPane.showInputDialog("Insira um ano")));
        data.setMes(Byte.parseByte(JOptionPane.showInputDialog("Insira um Mes")));
        data.setDia(Byte.parseByte(JOptionPane.showInputDialog("Insira um Dia")));

        System.out.println(data.getDia()+"/"+ data.getMes()+"/"+ data.getAno());
        System.out.println("O ano : "+ data.getAno() + " É bissexto? " + data.isAnoBissexto(data.getAno()));

        for(int anos =0;anos<=2025 ;anos++){
            if(data.isAnoBissexto(anos)){
                System.out.println(anos);
            }
        }
    }
}
