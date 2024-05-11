package br.com.senac.sistemaacademico.controller;

public class Boletim {
    
    float nota;
    int frequencia;
    String status;

    public Boletim() {//construtor

    }

    public Boletim(String st) { //sobrecarga do metodo construtor
        nota = 10;
        frequencia = 100;
        status = st;
    }

    public Boletim(float n, int f, String s) {
        nota = n;
        frequencia = f;
        status = s;
    }

    public void imprimir() {
        System.out.println(nota + "\n" + frequencia + "\n" + status);
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
}

