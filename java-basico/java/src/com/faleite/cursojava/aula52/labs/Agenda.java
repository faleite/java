package com.faleite.cursojava.aula52.labs;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private int numContatos;
    private Contato[] contatos;

    public Agenda(int numContatos) {
        this.numContatos = numContatos;
        this.contatos = new Contato[numContatos];
    }

    public void adcionarContatos(Contato[] contatos){
        this.contatos = contatos;
    }

    public boolean adcionarContato(String nome, String telefone){

        for (int i = 0; i < this.contatos.length; i++){
            if (this.contatos[i] == null){
                this.contatos[i] = new Contato(nome, telefone);
                return true;
            }
        }
        return false;
    }

    public void consultaContato(String nomeOrId){

        try {
            for (Contato contato : this.contatos){

                if (contato.getNome().equalsIgnoreCase(nomeOrId)
                        || contato.getId() == Integer.parseInt(nomeOrId)){
                    System.out.println(contato);
                }
            }
        }
        catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
