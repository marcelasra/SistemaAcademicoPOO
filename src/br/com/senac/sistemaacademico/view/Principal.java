package br.com.senac.sistemaacademico.view;

import br.com.senac.sistemaacademico.model.Aluno;
import br.com.senac.sistemaacademico.model.Professor;
import br.com.senac.sistemaacademico.model.Pessoa;
import br.com.senac.sistemaacademico.controller.Boletim;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Scanner txt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro do Senac!");

        System.out.print("Informe a quantidade de alunos: ");
        int tam = num.nextInt();

        Aluno listaAluno[] = new Aluno[tam];

        for (int i = 0; i < listaAluno.length; i++) {

            listaAluno[i] = new Aluno();

            System.out.print("Informe o nome do aluno: ");
            listaAluno[i].nome = txt.nextLine();

            System.out.print("Digite o RG do aluno: ");
            listaAluno[i].rg = txt.nextLine();

            System.out.print("Digite o CPF do aluno: ");
            listaAluno[i].cpf = txt.nextLine();

            System.out.print("Digite o Registro do Aluno: ");
            listaAluno[i].registroAluno = num.nextInt();

            System.out.print("Digite a nota do Vestibular: ");
            listaAluno[i].notaVestibular = num.nextFloat();

            System.out.print("Digite o curso: ");
            listaAluno[i].curso = txt.nextLine();

            System.out.print("Digite a data da matrícula: ");
            listaAluno[i].dataMatricula = txt.nextLine();
        }

        System.out.print("Informe a quantidade de professores: ");
        int tam2 = num.nextInt();

        Professor listaProfessor[] = new Professor[tam2];

        for (int i = 0; i < listaProfessor.length; i++) {

            listaProfessor[i] = new Professor();

            System.out.println("Digite o nome do Professor: ");
            listaProfessor[i].nome = txt.nextLine();

            System.out.println("Digite o rg do Professor: ");
            listaProfessor[i].rg = txt.nextLine();

            System.out.println("Digite o CPF do professor: ");
            listaProfessor[i].cpf = txt.nextLine();

            System.out.println("Digite a matrícula do professor: ");
            listaProfessor[i].matriculaProfessor = num.nextInt();

            System.out.println("Digite a data de Admissão: ");
            listaProfessor[i].dataAdmissao = txt.nextLine();

            System.out.println("Digite o salário/hora do professor: ");
            listaProfessor[i].salarioHorista = num.nextDouble();

        }
        for (int i = 0; i < listaAluno.length; i++) {
            System.out.println(listaAluno[i].nome);
            System.out.println(listaAluno[i].rg);
            System.out.println(listaAluno[i].cpf);
            System.out.println(listaAluno[i].registroAluno);
            System.out.println(listaAluno[i].notaVestibular);
            System.out.println(listaAluno[i].curso);
            System.out.println(listaAluno[i].dataMatricula);
        }
        for (int i = 0; i < listaProfessor.length; i++) {
            System.out.println(listaProfessor[i]);
        }
        txt.close();
        num.close();

        
        
        System.out.println("Entre com a nota de início: ");
        float nota = leia.nextFloat();

        System.out.println("Informe a frequência de início: ");
        int frequencia = leia.nextInt();

        System.out.println("Informe o status inicial: ");
        String status = leia.next();

        Boletim B1 = new Boletim(nota, frequencia, status);
        Boletim B2 = new Boletim();
        Boletim B3 = new Boletim("APROVADO");

        System.out.println("\nUso do construtor com 3 parâmetros...");
        B1.imprimir();

        System.out.println("\nUso do construtor com sem parâmetros...");
        B2.imprimir();

        System.out.println("\nUso do construtor com 1 parâmetros...");
        B3.imprimir();

    }
}
