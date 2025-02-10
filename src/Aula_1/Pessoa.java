package Aula_1;

public class Pessoa {
    int idade , totPassos;
    String nome;

    public void andar(){
        totPassos++;
    }

    public void imprimir(){
        System.out.printf("Ola %s , com %d anos. Voce andou um total de %d passos",nome,idade,totPassos);
    }
}