package br.com.senac.sistemaacademico.view;

import br.com.senac.sistemaacademico.model.Aluno;
import br.com.senac.sistemaacademico.model.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno[] vetorAlunos = new Aluno[100];
        Professor[] vetorProfessores = new Professor[100];

        Menu.exibirMenu(vetorAlunos, vetorProfessores);
    }
}