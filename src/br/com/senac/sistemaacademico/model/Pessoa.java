package br.com.senac.sistemaacademico.model;

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String retornaDados() {
        return "Nome: " + getNome() + "\n" +
               "RG: " + getRg() + "\n" +
               "CPF: " + getCpf() + "\n";
    }
}