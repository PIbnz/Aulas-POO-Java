package Aula_6.Parte2;

import javax.swing.*;
import java.awt.*;

public class TesteJFrame extends JFrame {
    JLabel nome;

    public TesteJFrame(){
        setTitle("Primeira tela JFrame");
        setSize(1275,1100);
        //anula layout padrão
        getContentPane().setLayout(null);
        //cor de fundo rgb
        getContentPane().setBackground(new Color(224, 46, 46));
        setLocationRelativeTo(null);
        setVisible(true); //Deixa visivel
        //provoca o termino da tela

        nome = criarJlLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TesteJFrame();
    }

    public void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if(janela.height>screen.height){

        }
    }

    public JLabel criarJlLabel(){
        JLabel jl = new JLabel();
        jl.setText("Miau");
        jl.setLocation(10,10);
        jl.setSize(370,50);

        jl.setOpaque(true);
        jl.setBackground(new Color(255,255,255));
        jl.setForeground(new Color(0,0,0));
        jl.setFont(new Font("Courrier new",Font.BOLD,12));
        jl.setToolTipText("exemplo");
        jl.setHorizontalAlignment(JTextField.LEFT);
        jl.setVerticalAlignment(JTextField.TOP);

                return jl;
    }

}
