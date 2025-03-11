package Aula_5;

import javax.swing.*;

public class Onibus extends Veiculo{
    int passageiros;

    public Onibus(String placa, int ano, int passageiros) {
        super(placa, ano);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void mostrarDados(){
        JOptionPane.showMessageDialog(null,"Placa:" + this.placa + " Ano:"+ this.ano + " Passageiros:" + this.passageiros);
    }
}
