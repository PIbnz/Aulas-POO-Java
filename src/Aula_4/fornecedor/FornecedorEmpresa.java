package Aula_4.fornecedor;

public class FornecedorEmpresa extends Fornecedor {
    private String ie;
    private String cnpj;

    public String getIe() {
        return ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public FornecedorEmpresa(String nome, String fone, String ie, String cnpj) {
        super(nome, fone);
        this.ie = ie;
        this.cnpj =cnpj;
    }
}
