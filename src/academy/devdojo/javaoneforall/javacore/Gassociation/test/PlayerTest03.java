package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Player player1 = new Player("Cafu");
        Player[] players = {player, player1};
        Team team = new Team("Brazil");

        player.setTeam(team);
        player1.setTeam(team);
        team.setPlayers(players);


        System.out.println("--- Player ---");
        player.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
