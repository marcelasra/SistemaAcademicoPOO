package br.com.senac.sistemaacademico.model;

public class Pessoa {
    String nome, cpf, rg;
    
    public String retornaDados(){
        String dados = "";

        dados += "Nome: " + nome + "\n"; 
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        
        return dados; 
    }
}
