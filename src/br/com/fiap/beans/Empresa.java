package br.com.fiap.beans;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    // metodo construto vazio


    public Empresa() {
        super();
    }

    // metodo construtor cheio (sem atributo de referencia)

    public Empresa(String cnpj, String razaoSocial) {
        super();
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "[Empresa]" +
                "\nCNPJ: " + cnpj +
                "\nRazão Social: " + razaoSocial +
                "\n" + endereco;
    }
}
