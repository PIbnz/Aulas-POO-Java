package Aula_6.Parte1;

public class Circulo {
    int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public int getDiametro(){return this.raio*2;}

    public double getArea(){return Math.PI *(this.raio*this.raio);}

    public double getPerimetro(){return Math.PI*2*this.raio;}

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
