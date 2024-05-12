package br.com.senac.sistemaacademico.model;

import java.util.Scanner;

public class Aluno extends Pessoa {

    private int registroAluno;
    private float notaVestibular;
    private String curso;
    private String dataMatricula;

    public int getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(int registroAluno) {
        this.registroAluno = registroAluno;
    }

    public float getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String retornaDados() {
        return super.retornaDados()
                + "Registro do Aluno: " + getRegistroAluno() + "\n"
                + "Nota do Vestibular: " + getNotaVestibular() + "\n"
                + "Curso: " + getCurso() + "\n"
                + "Data de Matrícula: " + getDataMatricula() + "\n";
    }

    public void cadastrarAluno(Aluno[] vetorAlunos) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetorAlunos.length; i++) {
            if (vetorAlunos[i] == null) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                setNome(nome);

                System.out.print("RG: ");
                String rg = scanner.nextLine();
                setRg(rg);

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                setCpf(cpf);

                System.out.print("Registro do Aluno: ");
                int registroAluno = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                setRegistroAluno(registroAluno);

                System.out.print("Nota do Vestibular: ");
                float notaVestibular = scanner.nextFloat();
                scanner.nextLine(); // Limpar o buffer
                setNotaVestibular(notaVestibular);

                System.out.print("Curso: ");
                String curso = scanner.nextLine();
                setCurso(curso);

                System.out.print("Data de Matrícula: ");
                String dataMatricula = scanner.nextLine();
                setDataMatricula(dataMatricula);

                vetorAlunos[i] = this;
                break;
            }
        }

        scanner.close();
    }
}
