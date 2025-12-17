package org.example;
import org.example.entities.Player;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setPlayerFullname("Ivan Ivanov");
        player1.setPlayerAge(16);
        player1.setPlayerClass(11);
        String playerInfo=player1.toString();
        System.out.println(playerInfo);

        Player player2 = new Player();
        player1.setPlayerFullname("Vladimus Argentum");
        player1.setPlayerAge(15);
        player1.setPlayerClass(11);
        String playerInfo2=player1.toString();
        System.out.println(playerInfo2);

    }
}