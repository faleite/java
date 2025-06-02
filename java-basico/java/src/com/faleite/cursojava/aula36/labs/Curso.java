package com.faleite.cursojava.aula36.labs;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() { }

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome do curso: " + this.nome + "\n";
        if (this.professor != null) {
            info += professor.obterInfo();
        }
        if (this.alunos != null) {
            System.out.println("----Alunos----");
            for (Aluno a : alunos) {
                if (a != null)
                    info += a.obterInfo() + "\n";
            }
            info += "\nMédia da turma: " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno a : alunos) {
            if (a != null) {
                soma += a.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}
