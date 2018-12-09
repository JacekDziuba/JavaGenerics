package com.company;

public class Main {

    public static void main(String[] args) {

        FootballPlayer aaron_donald = new FootballPlayer("Aaron Donald");
        BaseballPlayer cy_young = new BaseballPlayer("Cy Young");
        SoccerPlayer zinedine_zidane = new SoccerPlayer("Zinedine Zidane");

        Team<FootballPlayer> ny_giants = new Team<>("NY Giants");
        ny_giants.addPlayer(aaron_donald);

        Team<BaseballPlayer> chicago_cubs = new Team<>("Chicago Cubs");
        chicago_cubs.addPlayer(cy_young);

        Team<SoccerPlayer> ac_milan = new Team<>("AC Milan");
        ac_milan.addPlayer(zinedine_zidane);

        Team<FootballPlayer> los_angeles_rams = new Team<>("Los Angeles Rams");
        Team<FootballPlayer> new_england_patriots = new Team<>("New England Patriots");
        Team<FootballPlayer> dallas_cowboys = new Team<>("Dallas Cowboys");

        los_angeles_rams.matchResult(new_england_patriots, 1, 0);
//        los_angeles_rams.matchResult(ac_milan, 3, 0);
//        ac_milan.matchResult(new_england_patriots, 2, 1);
//        ac_milan.matchResult(new_england_patriots, 1,1);
        dallas_cowboys.matchResult(ny_giants, 1, 1);

        System.out.println("Rankings");
        System.out.println(los_angeles_rams.getName() + ": " + los_angeles_rams.ranking());
        System.out.println(new_england_patriots.getName() + ": " + new_england_patriots.ranking());
        System.out.println(ny_giants.getName() + ": " + ny_giants.ranking());
        System.out.println(dallas_cowboys.getName() + ": " + dallas_cowboys.ranking());

        System.out.println(los_angeles_rams.compareTo(dallas_cowboys));
        System.out.println(new_england_patriots.compareTo(dallas_cowboys));

    }
}
