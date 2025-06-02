package com.faleite.cursojava.aula36.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TesteCurso {

    public static void cadastroAluno(Aluno aluno, String nome, String matricula){
        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        aluno.setNotas(new double[4]);
    }

    public static void imprirCurso(Curso curso){
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Horário: " + curso.getHorario());
        System.out.println("Alunos: ");
        for (Aluno aluno : curso.getAlunos()) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
            System.out.println("Notas: " + aluno.getNotas()[0] + " " + aluno.getNotas()[1]
            + " " + aluno.getNotas()[2] + " " + aluno.getNotas()[3]);
        }
    }

    public static double calcularMedia(double[] notas){
        /*double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;*/
        return Arrays.stream(notas).sum() / notas.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nome = scan.nextLine();
        System.out.println("Digite o horario do curso: ");
        String horario = scan.nextLine();
        Curso curso = new Curso(nome, horario);

        System.out.println("Digite o nome do professor: ");
        String nomeProf = scan.nextLine();
        System.out.println("Digite o departamento do professor: ");
        String depProf = scan.nextLine();
        System.out.println("Digite o email do professor: ");
        String emailProf = scan.nextLine();

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
        }

//        ArrayList<Double> mediaTurma = new ArrayList<>();



        cadastroAluno(alunos[0], "Joao", "1111");
        cadastroAluno(alunos[1], "Maria", "2222");
        cadastroAluno(alunos[2], "Pedro", "3333");
        cadastroAluno(alunos[3], "Ana", "4444");
        cadastroAluno(alunos[4], "Jose", "5555");

        curso.setAlunos(alunos);

        for (Aluno aluno : curso.getAlunos()) {
            System.out.println("Entre com as notas do(a) aluno(a) " + aluno.getNome() + ": ");
            for (int i = 0; i < aluno.getNotas().length; i++) {
                System.out.println("Digite a nota " + (i + 1) + ": ");
                double nota = scan.nextDouble();
                while ( nota < 0 || nota > 10) {
                    System.out.println("Nota invalida, tente novamente:");
                    nota = scan.nextDouble();
                }
                aluno.setNota(nota, i);
            }
            /*double media = calcularMedia(aluno.getNotas());
            aluno.setMedia(media);
            mediaTurma.add(media);*/
        }
        /*for (Aluno aluno : curso.getAlunos()) {
            System.out.println("Média do aluno " + aluno.getNome() + ": " + aluno.getMedia());
        }
        double mediaTurmaFinal = mediaTurma.stream().mapToDouble(Double::doubleValue).sum() / mediaTurma.size();
        System.out.println("Média da turma: " + mediaTurmaFinal);*/
        //imprirCurso(curso);

        System.out.println(curso.obterInfo());
    }
}
