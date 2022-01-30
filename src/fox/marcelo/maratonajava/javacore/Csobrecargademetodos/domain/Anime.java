package fox.marcelo.maratonajava.javacore.Csobrecargademetodos.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String genre; // Foi adicionado depois.

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    // Para não quebrar o código, é possível fazer uma sobrecarga.
    // Pode-se usar o mesmo nome com parametros diferentes.
    // Dessa forma o gênero que foi adicionado depois pode ser colocado dentro do método init.
    public void init(String name, String type, int episodes, String genre) {
        this.init(name, type, episodes);
        this.genre = genre;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Episódios: " + this.episodes);
        System.out.println("Gênero: " + this.genre);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
