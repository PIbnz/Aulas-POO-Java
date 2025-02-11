package Aula_2;

public class Carro {
    protected int litroNoTanque = 0;
    protected boolean carroLigado;
    protected int capTanque = 40;

    protected void encherTanque(int litros){
        if(litros < capTanque && litros < (capTanque-litroNoTanque)) {
            litroNoTanque += litros;
            System.out.println("A capacidade atual do tanque é " + litroNoTanque +"L");
        }else{
            System.out.println("O tanque encheu");
            litros = litros - (capTanque-litroNoTanque);
            litroNoTanque = capTanque;
            System.out.println("Soubrou " + litros + " do total colocado");
            System.out.println("A capacidade atual do tanque é " + litroNoTanque +"L");
        }
    }
}
