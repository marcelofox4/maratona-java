package fox.marcelo.maratonajava.javacore.Csobrecargademetodos.test;

import fox.marcelo.maratonajava.javacore.Csobrecargademetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.init("Bleach", "TV",12);
        anime.init("Bleach", "TV", 12, "Ação");

        anime.print();

    }
}
