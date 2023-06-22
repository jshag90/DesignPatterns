package com.ji.behavioral_patterns.memento.after;

public class GameSave {

    private final int blueTeamScore;

    private final int readTeamScore;


    public GameSave(int blueTeamScore, int readTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.readTeamScore = readTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public int getRedTeamScore() {
        return readTeamScore;
    }
}
