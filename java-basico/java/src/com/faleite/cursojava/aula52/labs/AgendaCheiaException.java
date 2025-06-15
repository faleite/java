package com.faleite.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {

    protected String message;

    public AgendaCheiaException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String toString() {
        return "Agenda Cheia{" +
                "Não foi possivel adicionar '" + message + '\'' +
                '}';
    }

    // Prof:

    public AgendaCheiaException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Agenda já esta cheia";
    }
}
