package com.company;

public class Main {

    public static void main(String[] args) {

        FootballPlayer marta = new FootballPlayer("Marta");
        BaseballPlayer jacek = new BaseballPlayer("Jacek");
        SoccerPlayer jerzy = new SoccerPlayer("Jerzy");

        Team dziuba_team = new Team("Dziubas Team");
        dziuba_team.addPlayer(marta);
        dziuba_team.addPlayer(jacek);
        dziuba_team.addPlayer(jerzy);

        System.out.println(dziuba_team.numPlayers());

    }
}
