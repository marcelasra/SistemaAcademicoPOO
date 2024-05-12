package br.com.senac.sistemaacademico.view;

import br.com.senac.sistemaacademico.controller.Boletim;
import br.com.senac.sistemaacademico.model.Aluno;
import br.com.senac.sistemaacademico.model.Professor;
import java.util.Scanner;

public class Menu {
    public static void exibirMenu(Aluno[] vetorAlunos, Professor[] vetorProfessores) {
        Scanner sc = new Scanner(System.in);
        Boletim boletim = new Boletim();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Lançar Notas e Faltas");
            System.out.println("4. Exibir Boletim");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = sc.nextLine(); // Lê a opção como uma string

            switch (opcao) {
                case "1":
                    System.out.print("Quantos alunos deseja cadastrar? ");
                    int quantidadeAlunos = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        Aluno aluno = new Aluno();
                        aluno.cadastrarAluno(vetorAlunos);
                    }
                    break;
                case "2":
                    System.out.print("Quantos professores deseja cadastrar? ");
                    int quantidadeProfessores = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    for (int i = 0; i < quantidadeProfessores; i++) {
                        Professor professor = new Professor();
                        professor.cadastrarProfessor(vetorProfessores);
                    }
                    break;
                case "3":
                    boletim.lancarNotasEFaltas(vetorAlunos);
                    break;
                case "4":
                    boletim.exibirBoletim(vetorAlunos);
                    break;
                case "5":
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}