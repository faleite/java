package com.faleite.cursojava.aula36.labs;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNota(double nota, int index) {
        this.notas[index] = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String obterInfo(){
        String info = "Nome do aluno: " + this.nome + "; ";
        info += "Matricula = " + this.matricula + "; ";
        info += "Notas: ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma / notas.length;
        info += "\nMédia = " + media + "-";
        if (media >= 7) {
            return info += " Aprovado";
        }
        return info += " Reprovado";
    }

    public double obterMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
