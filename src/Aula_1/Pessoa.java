package Aula_1;

public class Pessoa {
    int idade , totPassos;
    private String nome;

    public void andar(){
        totPassos++;
    }

    public void imprimir(){
        System.out.printf("Ola %s , com %d anos. Voce andou um total de %d passos",nome,idade,totPassos);
    }

    //trocar atributo privado
    public void setNome(String nome){
        this.nome = nome;
    }

    //acessa atributo privado
    public String getNome(){
        return nome;
    }


}