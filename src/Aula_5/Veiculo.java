package Aula_5;

import javax.swing.*;

public class Veiculo {
    String placa;
    int ano;

    public Veiculo(){}

    public Veiculo(String placa,int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano){
        this.ano= Integer.parseInt(ano);
    }

    public void mostrarDados(){
        JOptionPane.showInputDialog("Placa:"+ this.placa + " Ano:" + this.ano);
    }

    public static void main(String[] args) {

    }
}
