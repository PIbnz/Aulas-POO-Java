package Aula_4.fornecedor;

public class FornecedorPessoa extends Fornecedor {
    private String rg;
    private String cpf;

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public FornecedorPessoa(String nome, String fone, String rg,String cpf) {
        super(nome, fone);
        this.rg = rg;
        this.cpf = cpf;
    }

    public FornecedorPessoa(){}
}
