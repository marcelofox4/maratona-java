package fox.marcelo.maratonajava.javacore.Gassociacao.test;

import fox.marcelo.maratonajava.javacore.Gassociacao.domain.Player;
import fox.marcelo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest01 {
    public static void main(String[] args) {

        // Associação é o relacionamento entre dois objetos.
        /*
        * Tem-se as seguintes associações:
        * 1 -- 1
        * 1 -- N
        * N -- 1
        * N -- N
        * */

        // Team 1 -- N Players = Associação Unidirecional
        Player player1 = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");

        player1.setTeam(team);
        player1.print();

    }
}
