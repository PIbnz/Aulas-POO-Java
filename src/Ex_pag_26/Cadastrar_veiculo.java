package Ex_pag_26;

import javax.swing.*;
import java.util.Scanner;

public class Cadastrar_veiculo {
    Veiculo carro = new Veiculo();
    Scanner leitor = new Scanner(System.in);

    public void cadastro_carro(){
        //System.out.println("Informe a marca do carro");
        //carro.marca = leitor.next();
        carro.marca = JOptionPane.showInputDialog("Informe a marca do carro");
        //System.out.println("Informe o ano do carro");
        //carro.ano = leitor.nextInt();
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));
        //System.out.println("Informe o modelo do carro");
        //carro.modelo = leitor.next();
        carro.modelo = JOptionPane.showInputDialog("Informe o modelo do carro");
        //System.out.println("Informe a potencia do carro");
        //carro.potencia = leitor.nextFloat();
        carro.potencia = Float.parseFloat(JOptionPane.showInputDialog("Informe a potencia do carro"));
        System.out.println("Veiculo Registrado");
    }

    public void exibir_dados(){
        System.out.println("Ano:" +carro.ano);
        System.out.println("Marca:" +carro.marca);
        System.out.println("Modelo:" +carro.modelo);
        System.out.println("Potencia:" +carro.potencia);
    }
}
