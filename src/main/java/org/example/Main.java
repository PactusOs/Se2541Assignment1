package org.example;
import org.example.entities.Player;
import org.example.entities.Sport;
import org.example.entities.SportsClub;

public class Main {

    public static void main(String[] args) {
        //enter sportclub
        SportsClub sportsClub1 = new SportsClub();
        sportsClub1.setClubName("AVT");
        sportsClub1.setMemberscount(41);
        //enter sport
        Sport sport1 = new Sport();
        sport1.setSports("Volleyball");

        //enter sportclub
        SportsClub sportsClub2 = new SportsClub();
        sportsClub2.setClubName("AFC");
        sportsClub2.setMemberscount(56);
        //enter sport
        Sport sport2 = new Sport();
        sport2.setSports("Football");

        //enter 1player
        Player player1 = new Player();
        player1.setPlayerFullname("Ivan Ivanov");
        player1.setPlayerAge(16);
        player1.setPlayerClass(11);
        //errors
        player1.setSportsClub(sportsClub2);
        player1.setSport(sport2);
        //output
        String playerInfo=player1.toString();
        System.out.println(playerInfo);


        //enter 2player
        Player player2 = new Player();
        player1.setPlayerFullname("Kirill Bread");
        player1.setPlayerAge(17);
        player1.setPlayerClass(11);
        //errors
        player1.setSportsClub(sportsClub1);
        player1.setSport(sport1);

        //output
        String playerInfo2=player2.toString();
        System.out.println(playerInfo2);

        //massive for comparing
        Player[] players=new Player[3];
        for(Player e:players){
            e=new Player();
            e.setPlayerFullname("Ivan");
            e.setPlayerAge(16);
            e.setPlayerClass(11);
            SportsClub s = new SportsClub();
            s.setClubName("ALK");
            e.setSportsClub(s);


            System.out.println(e.toString());
        }

        players[0]=player1;
        players[1]=player2;

        for (int i=0; i<2; i++){
            if (players[0].getPlayerAge()>players[1].getPlayerAge()){
                System.out.println(players[0]+" is older");
            }
            else {
                System.out.println(players[1]+" is older");
            }
        }


    }
}