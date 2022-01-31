package fox.marcelo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String name;
    private static int[] episodes;

    // Ordem de execução da classe:
    /*
    * 0 - Bloco de inicialização static é executado quando a JVM carrega a classe
    * 1 - Alocado espaço em memória para o objeto;
    * 2 - Cada atributo da classe é inicializado;
    * 3 - Bloco de inicialização é executado;
    * 4 - Construtor inicializado
    * */

    // Bloco de inicialização static. É executado apenas uma vez. Diferente do bloco de inicialização normal.
    // Não é possível acessar atributos de instancia dentro do bloco.
    static {
        System.out.println("Dentro do Bloco de Inicialização Static 1");
        episodes = new int[50];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    // Quando se tem mais de um bloco de inicialização static. Eles serão inicializados na ordem que aparecem.
    static {
        System.out.println("Dentro do Bloco de Inicialização Static 2");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização Não Static");
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
