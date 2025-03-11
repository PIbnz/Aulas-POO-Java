package Aula_5;

import javax.swing.*;

public class Caminhao extends Veiculo{
    int pesoCarga;

    public Caminhao(String placa, int ano, int pesoCarga){
        super(placa, ano);
        this.pesoCarga =pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public void mostrarDados(){
        JOptionPane.showMessageDialog(null,"Placa:" + this.placa + " Ano:"+ this.ano + " Pesso da carga:" + this.pesoCarga+"kg");
    }
}
