package br.com.senac.sistemaacademico.model;

public class Professor extends Pessoa {
    
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    public Professor(){
        
        super();
        
    }
    
    public Professor (String nome, String rg, String cpf, int matriculaProfessor,
            String dataAdmissao, double salarioHorista){
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.matriculaProfessor = matriculaProfessor;
        this.dataAdmissao = dataAdmissao;
        this.salarioHorista = salarioHorista;
        
    }

    public String retornaDadosProfessor() {
        String dados;

        dados = super.retornaDados(); //

        dados += "Matrícula do Professor: " + matriculaProfessor + "\n";
        dados += "Data Admissão: " + dataAdmissao + "\n";
        dados += "Salário Horista: " + salarioHorista + "\n";

        return dados;
    }

}

