package com.test.hmsassignment;

public class Leaderboard {
    String name;
    int score;

    Leaderboard(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "                                                                   " + score;

    }
}
