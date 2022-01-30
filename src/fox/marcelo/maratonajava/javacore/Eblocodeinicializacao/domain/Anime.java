package fox.marcelo.maratonajava.javacore.Eblocodeinicializacao.domain;

public class Anime {

    private String name;
    private int[] episodes;

    // Ordem de execução da classe:
    /*
    * 1 - Alocado espaço em memória para o objeto;
    * 2 - Cada atributo da classe é inicializado;
    * 3 - Bloco de inicialização é executado;
    * 4 - Construtor inicializado
    * */

    // Bloco de inicialização de instância. Ele é executado todas as vezes que um objeto é criado.
    {
        episodes = new int[50];
        for (int i = 0; i < episodes.length; i++) {
            this.episodes[i] = i + 1;
        }
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
