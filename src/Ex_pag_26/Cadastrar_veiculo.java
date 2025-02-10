package Ex_pag_26;

import java.util.Scanner;

public class Cadastrar_veiculo {
    Veiculo carro = new Veiculo();
    Scanner leitor = new Scanner(System.in);

    public void cadastro_carro(){
        System.out.println("Informe a marca do carro");
        carro.marca = leitor.next();
        System.out.println("Informe o ano do carro");
        carro.ano = leitor.nextInt();
        System.out.println("Informe o modelo do carro");
        carro.modelo = leitor.next();
        System.out.println("Informe a potencia do carro");
        carro.potencia = leitor.nextFloat();
        System.out.println("Veiculo Registrado");
    }
}
