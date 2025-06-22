package com.faleite.cursojava.aula64;

public class Externa {

    private String texto = "Texto externo";

    public class Interna {

        private String texto = "Texto interno";

        public void imprimeTexto(){
            System.out.println(texto); // out: Texto interno

            // Consegue ver membros da classe externa
            System.out.println(Externa.this.texto); // out: Texto externo
        }
    }

    public static void main(String[] args) {

        Externa externa = new Externa(); // instancia de forma normal

        // é preciso ter uma instancia da classe externa
        // para depois instanciar a classe interna
        // Se a clsse interna fosse estatica não seria
        // preciso de uma instancia da classe externa
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }
}
