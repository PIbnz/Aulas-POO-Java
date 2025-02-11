package Aula_2;

public class Data {
    private int ano;
    private byte mes;
    private byte dia;

    public int getAno(){
        return ano;
    }

    public void setAno(int a){
        if(a>0){
            this.ano = a;
        }else{
            System.out.println("Ano invalido");
        }
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        if(dia >0 && dia<31) {
            this.dia = dia;
        }else {
            System.out.println("Dia invalido");
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        if(mes >0 && mes<=12) {
            this.mes = mes;
        }else {
            System.out.println("Mes invalido");
        }
    }

    public boolean isAnoBissexto(int ano){
        return ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0);
    }
}
