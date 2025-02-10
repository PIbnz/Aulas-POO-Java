package Ex_pag_26;

public class Veiculo {
    String marca, modelo;
    int ano;
    int marcha = 0;
    float potencia;

    public void ligar() {
        System.out.println("O carro está ligado");
        marcha = 1;
    }

    public void desligar() {
        System.out.println("O carro está desligado");
        marcha = 0;
    }

    public void trocarMarcha(int velocidade) {
        if (velocidade > 20 && velocidade <= 40) {
            marcha = 2;
        } else if (velocidade > 40 && velocidade <= 60) {
            marcha = 3;
        } else if (velocidade > 60 && velocidade <= 80) {
            marcha = 4;
        } else if (velocidade < 0) {
            desligar();
        } else if (velocidade > 0 && velocidade <=20) {
            marcha = 1;
        } else {
            marcha = 5;
        }
    }
}
