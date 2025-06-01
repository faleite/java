package com.faleite.cursojava.aula36.labs;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda(){
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getAgenda(){
        String info = "Nome: " + this.nome + "\n";

        if (this.contatos != null) {
            for (Contato c : this.contatos) {
                info += c.getContato() + "\n";
            }
        }
        return info;
    }
}
