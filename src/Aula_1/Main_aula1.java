package Aula_1;

import javax.swing.*;

public class Main_aula1 {
    public static void main(String[] args) {
        Main_aula1 nova = new Main_aula1();
        Cadastrar_Pessoa cadastro = new Cadastrar_Pessoa();



        cadastro.cadastrar(18,"Pedro");




    }


    public double somar (double n1,double n2){
        return n1+n2;
    }

    public void falar(){
        JOptionPane.showInputDialog("Bem vindos");
    }




}
