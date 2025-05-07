package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

/**
 * A classe:
 * 1. Alocado espaço em memória para o objeto
 * 2. Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
 * 3. O Bloco de inicializaçõa é executado.
 * 4. O Construtor é executado
 */
public class Anime {
    private String nome;
//    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private int[] episodios;

    {
        System.out.println("Dentro do bloco inicializador");
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios)
            System.out.print(episodio + " ");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
