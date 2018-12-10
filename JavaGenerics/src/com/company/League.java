package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    // == fields ==

    private String leagueName;
    private ArrayList<T> teams = new ArrayList<>();

    // == constructors ==

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = teams;
    }

    // == methods ==

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the" + "league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the " + leagueName + " league");
            return true;
        }
    }

    public void printInOrder() {
        Collections.sort(teams);
        for (T team: teams) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }

}
