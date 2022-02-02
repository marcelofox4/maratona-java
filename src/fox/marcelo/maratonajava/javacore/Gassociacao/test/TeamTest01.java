package fox.marcelo.maratonajava.javacore.Gassociacao.test;

import fox.marcelo.maratonajava.javacore.Gassociacao.domain.Player;
import fox.marcelo.maratonajava.javacore.Gassociacao.domain.Team;

public class TeamTest01 {
    public static void main(String[] args) {

        Player player1 = new Player("Neymar");
        Player player2 = new Player("Ronaldinho");
        Player[] players = {player1, player2};

        Team team = new Team("Seleção Brasileira");

        team.setPlayers(players);

        player1.setTeam(team);
        player2.setTeam(team);

        System.out.println("--- Jogadores ---");
        player1.print();
        System.out.println();
        player2.print();

        System.out.println("--- Time ---");
        team.print();
    }
}
