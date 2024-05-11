
package br.com.senac.sistemaacademico.model;

public class Aluno extends Pessoa {
    
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
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