
package br.com.senac.sistemaacademico.model;

public class Aluno extends Pessoa {
    
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
    public Aluno(){
        
        super();
        
    }
    
    public Aluno(String nome, String rg, String cpf, int registroAluno, 
            float notaVestibular, String curso, String dataMatricula){
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        
    }
    
    public String retornaDadosAluno(){
        String dados;
        
        dados = super.retornaDados();
        
        dados += "RA: " + registroAluno + "\n";
        dados += "Nota do vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data Matrícula: " + dataMatricula + "\n";
        
        return dados;
    }
}