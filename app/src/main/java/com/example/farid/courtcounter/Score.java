package com.example.farid.courtcounter;


public class Score {

    private int points;

    public Score () {
        points = 0;
    }

    public void addThreePoints() {
        points += 3;
    }

    public void addTwoPoints() {
        points += 2;
    }

    public void addOnePoints() {
        points += 1;
    }

    public void reset() {
        points = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(points);
    }
}
