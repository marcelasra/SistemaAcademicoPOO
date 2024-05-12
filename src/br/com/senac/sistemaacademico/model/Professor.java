package br.com.senac.sistemaacademico.model;

import java.util.Scanner;

public class Professor extends Pessoa {

    private int matriculaProfessor;
    private String dataAdmissao;
    private double salarioHorista;

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioHorista() {
        return salarioHorista;
    }

    public void setSalarioHorista(double salarioHorista) {
        this.salarioHorista = salarioHorista;
    }

    @Override
    public String retornaDados() {
        return super.retornaDados()
                + "Matrícula do Professor: " + getMatriculaProfessor() + "\n"
                + "Data de Admissão: " + getDataAdmissao() + "\n"
                + "Salário Horista: " + getSalarioHorista() + "\n";
    }

    public void cadastrarProfessor(Professor[] vetorProfessores) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetorProfessores.length; i++) {
            if (vetorProfessores[i] == null) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                setNome(nome);

                System.out.print("RG: ");
                String rg = scanner.nextLine();
                setRg(rg);

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                setCpf(cpf);

                System.out.print("Matrícula do Professor: ");
                int matriculaProfessor = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                setMatriculaProfessor(matriculaProfessor);

                System.out.print("Data de Admissão: ");
                String dataAdmissao = scanner.nextLine();
                setDataAdmissao(dataAdmissao);

                System.out.print("Salário Horista: ");
                double salarioHorista = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                setSalarioHorista(salarioHorista);

                vetorProfessores[i] = this;
                break;
            }
        }

        scanner.close();
    }
}
