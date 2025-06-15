package com.faleite.cursojava.aula52.labs;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    //private String email;

    private static int contador = 0;

    public Contato() {
        contador++;
        this.id = contador;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        contador++;
        this.id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id='" + id + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nome=" + nome +
                '}';
    }
}
