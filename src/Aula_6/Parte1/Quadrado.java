package Aula_6.Parte1;

public class Quadrado {
    int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int getArea(){return this.lado * this.lado;}

    public int getPerimetro(){return this.lado*4;}

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
