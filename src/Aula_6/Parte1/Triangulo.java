package Aula_6.Parte1;

public class Triangulo {
    int a,b,c;
    double h;

    public Triangulo(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        int s = (a + b + c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        this.h = (2*ar)/b;
    }



    public double getArea(){return (this.b * this.h)/2;}

    public int getPerimetro(){return a+b+c;}

    @Override
    public String toString() {
        return "Triangulo{" +
                "h=" + h +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
