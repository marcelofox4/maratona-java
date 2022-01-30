package fox.marcelo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    // Os construtores servem para literalmente construir objetos.
    // Mesmo que não seja colocado na classe o compilador do Java adicona na hora da compilação.
    // É executado antes de qualquer método da classe.
    public Anime(String name, String type, int episodes, String genre) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    // É possível a sobrecarga de construtores.
    public Anime(String name, String type, int episodes, String genre, String studio) {
        // this tem que ser a primeira linha no corpo do construtor.
        this(name, type, episodes, genre);
        this.studio = studio;
    }

    public Anime() {

    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Episodios: " + this.episodes);
        System.out.println("Gênero: " + this.genre);
        System.out.println("EStúdio: " + this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
