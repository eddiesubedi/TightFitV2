package com.tightfit.model;

public class Stat {
    private int highScore;
    private int gems;

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getGems() {
        return gems;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "highScore=" + highScore +
                ", gems=" + gems +
                '}';
    }
}
