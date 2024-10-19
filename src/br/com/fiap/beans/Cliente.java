package br.com.fiap.beans;

public class Cliente {
    private String rg;
    private String nome;
    private int idade;
    private String cpf;
    private double renda;
    private Endereco endereco;

    // metodo construtor vazio

    public Cliente() {
        super();
    }

    // metodo construtor cheio (sem atributo de referencia)

    // Na saída tem que usar a mesma ordem do metodo construtor

    public Cliente(String rg, String nome, int idade, String cpf, double renda) {
        super();
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.renda = renda;
    }

    // Setters (Entrada) & Getters (Retornar / Exibir)

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // ToString


    @Override
    public String toString() {
        return "[Cliente]" +
                "\nRG: " + rg +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCPF: " + cpf +
                "\nRenda: " + renda +
                "\n" + endereco;
    }
}
