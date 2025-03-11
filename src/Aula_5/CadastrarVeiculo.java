package Aula_5;

import javax.swing.*;

public class CadastrarVeiculo {

    public static void main(String[] args) {
        String[] options = {"Cadastrar Veiculo", "Sair"};
        String[] veiculos = {"Onibus","Caminhão"};
        while (true) {

            int opção = JOptionPane.showOptionDialog(null, "Selecione a ação", "Opção", 0, 2, null, options, options[1]);

            if (opção == 0) {
            int opção_ = JOptionPane.showOptionDialog(null, "Selecione o tipo de Veiculo", "Opção", 0, 2, null, veiculos, veiculos[0]);

            String placa = JOptionPane.showInputDialog("Informe a placa");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe a ano"));


            if(opção_ == 0){
                int passageiros = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de passageiros"));

                Onibus onibus = new Onibus(placa,ano,passageiros);
                onibus.mostrarDados();
            }else{
                int pesoCarga = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da carga"));

                Caminhao caminhao = new Caminhao(placa,ano,pesoCarga);
                caminhao.mostrarDados();
            }
            }else{
                break;
            }
        }
    }
}
