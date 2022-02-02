package fox.marcelo.maratonajava.javacore.Gassociacao.domain;

public class Team {

    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println(this.name);
        if (this.players == null) {
            return;
        }
        for (Player player : this.players) {
            System.out.println(player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
