package com.faleite.cursojava.aula52.labs;

public class Agenda {
    private int qtdDeContatos;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(int qtdDeContatos) {
        this.qtdDeContatos = qtdDeContatos;
        this.contatos = new Contato[qtdDeContatos];
    }

    public void adicionarContatos(Contato[] contatos){
        this.contatos = contatos;
    }

    public boolean adicionarContato(String nome, String telefone){

        for (int i = 0; i < this.contatos.length; i++){
            if (this.contatos[i] == null){
                this.contatos[i] = new Contato(nome, telefone);
                return true;
            }
        }
        return false;
    }

    public boolean consultaContato(String nomeOrId){

        if (this.contatos == null) {
            return false;
        }

        for (Contato contato : this.contatos){
            try {
                int id = Integer.parseInt(nomeOrId);
                if (contato != null && contato.getId() == id){
                    System.out.println(contato);
                    return true;
                }
            }
            catch (NumberFormatException e) {
                if (contato != null && contato.getNome().equalsIgnoreCase(nomeOrId)) {
                    System.out.println(contato);
                    return true;
                }
            }
        }
        return false;
    }
}
