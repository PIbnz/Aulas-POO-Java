package Aula_1;

public class Cadastrar_Pessoa {
    Pessoa pessoa = new Pessoa();

    public void cadastrar(int idade, String nome){
        pessoa.nome = nome;
        pessoa.idade =idade;
        pessoa.totPassos=0;
        for (int i = 0; i<100;i++){
            pessoa.andar();
        }
        pessoa.imprimir();
    }
}