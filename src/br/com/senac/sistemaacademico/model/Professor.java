package br.com.senac.sistemaacademico.model;

public class Professor extends Pessoa {
    
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;

    public String retornaDadosProfessor() {
        String dados;

        dados = super.retornaDados(); //

        dados += "Matrícula do Professor: " + matriculaProfessor + "\n";
        dados += "Data Admissão: " + dataAdmissao + "\n";
        dados += "Salário Horista: " + salarioHorista + "\n";

        return dados;
    }

}

