package fox.marcelo.maratonajava.javacore.Dconstrutores.test;

import fox.marcelo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Naruto", "TV", 200, "Ação");
        Anime anime1 = new Anime();

        anime.print();
        System.out.println("-----------------");
        anime1.print();
    }
}
