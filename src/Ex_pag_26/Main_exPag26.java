package Ex_pag_26;

import javax.swing.*;
import java.util.Scanner;

public class Main_exPag26 {

    public static void main(String[] args) {

        Cadastrar_veiculo cadastro = new Cadastrar_veiculo();
        Veiculo carro = new Veiculo();
        Scanner leitor = new Scanner(System.in);

        int velocidade;
        cadastro.cadastro_carro();
        carro.ligar();
        for(int cont = 0; cont<10;cont++) {
            System.out.printf("A marcha atual é %d", carro.marcha);
            System.out.println();
            velocidade = Integer.parseInt(JOptionPane.showInputDialog("Troque a velocidade"));
            carro.trocarMarcha(velocidade);
        }
        cadastro.exibir_dados();

    }

}
