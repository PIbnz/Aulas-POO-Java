package Aula_3;

public class Circulo {
    double raio;

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI * (this.raio* this.raio);
    }

    public double getPerimetro(){
        return Math.PI * 2 * this.raio;
    }

    //construtor
    public Circulo(double raio){
        this.raio= raio;
    }
}

