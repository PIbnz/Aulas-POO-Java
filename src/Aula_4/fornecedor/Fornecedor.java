package Aula_4.fornecedor;

public class Fornecedor {
    private String nome;
    private String fone;

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Fornecedor() {
    }

    public Fornecedor(String nome,String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public static void main(String[] args) {

    }
}
