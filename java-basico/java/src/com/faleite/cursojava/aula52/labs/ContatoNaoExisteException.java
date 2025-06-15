package com.faleite.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

    protected String nomeOrId;

    public ContatoNaoExisteException(String nomeOrId) {
        super();
        this.nomeOrId = nomeOrId;
    }

    @Override
    public String toString() {
        return "Contato Nao Existe{" +
                "contato=" + nomeOrId +
                '}';
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeOrId + " não existe na agenda!";
    }
}
