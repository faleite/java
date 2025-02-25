package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
//        Anime anime2 = new Anime();

        anime.imprime();
        System.out.println("=====================");
//        anime2.imprime();




//        anime.init("Akudama Drive", "TV", 12);
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
    }
}
