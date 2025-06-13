package com.faleite.cursojava.aula52.labs;

public class Contato {

    private String nome;
    private String telefone;
    private int id;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id++;
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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", id=" + id +
                '}';
    }
}
