package br.com.senac.sistemaacademico.controller;

import br.com.senac.sistemaacademico.model.Aluno;
import java.util.Scanner;

public class Boletim {
    private float nota;
    private int frequencia;
    private String status;

    public Boletim() {}

    public Boletim(float nota, int frequencia, String status) {
        this.nota = nota;
        this.frequencia = frequencia;
        this.status = status;
    }

    public Boletim(String status) {
        this.status = status;
    }

    public float calcularMedia() {
        return nota >= 6 ? nota : 0;
    }

    public String definirStatus() {
        int frequenciaMaxima = 100;
        float frequenciaMinima = 0.75f * frequenciaMaxima;
        float media = calcularMedia();

        if (frequencia >= (int) frequenciaMinima && media >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        return status;
    }

    public void imprimir() {
        System.out.println("Nota: " + nota);
        System.out.println("Frequência: " + frequencia);
        System.out.println("Status: " + status);
    }

    public void lancarNotasEFaltas(Aluno[] vetorAlunos) {
        Scanner scanner = new Scanner(System.in);

        for (Aluno aluno : vetorAlunos) {
            if (aluno != null) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.print("Nota: ");
                float nota = scanner.nextFloat();
                System.out.print("Frequência: ");
                int frequencia = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                Boletim boletim = new Boletim(nota, frequencia, "");
                float media = boletim.calcularMedia();
                String status = boletim.definirStatus();

                System.out.println("Média: " + media);
                System.out.println("Status: " + status);
            }
        }

        scanner.close();
    }

    public void exibirBoletim(Aluno[] vetorAlunos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o registro do aluno: ");
        int registroAluno = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (Aluno aluno : vetorAlunos) {
            if (aluno != null && aluno.getRegistroAluno() == registroAluno) {
                System.out.println(aluno.retornaDados());

                Boletim boletim = new Boletim();
                boletim.imprimir();
                scanner.close();
                return;
            }
        }

        System.out.println("Registro de aluno não encontrado.");
        scanner.close();
    }
}
