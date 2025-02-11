package Aula_2;

import javax.swing.*;

public class TesteCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        for (int cont = 0 ; cont<5;cont++){
        carro.encherTanque(Integer.parseInt(JOptionPane.showInputDialog("Encha o tanque")));
        if(carro.litroNoTanque == carro.capTanque){break;}
        }
        carro.carroLigado = true;
    }
}
