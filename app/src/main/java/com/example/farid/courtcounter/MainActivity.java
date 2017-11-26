package com.example.farid.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Score scoreTeamA = new Score();
    private Score scoreTeamB = new Score();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA.addThreePoints();
        displayScoreTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View view) {
        scoreTeamA.addTwoPoints();
        displayScoreTeamA(scoreTeamA);
    }

    public void addOnePointsForTeamA(View view) {
        scoreTeamA.addOnePoints();
        displayScoreTeamA(scoreTeamA);
    }

    private void displayScoreTeamA(Score score) {
        TextView viewById = findViewById(R.id.score_team_a);
        viewById.setText(score.toString());
    }

    public void addThreePointsForTeamB(View view) {
        scoreTeamB.addThreePoints();
        displayScoreTeamB(scoreTeamB);
    }

    public void addTwoPointsForTeamB(View view) {
        scoreTeamB.addTwoPoints();
        displayScoreTeamB(scoreTeamB);
    }

    public void addOnePointsForTeamB(View view) {
        scoreTeamB.addOnePoints();
        displayScoreTeamB(scoreTeamB);
    }

    private void displayScoreTeamB(Score score) {
        TextView viewById = findViewById(R.id.score_team_b);
        viewById.setText(score.toString());
    }

    public void resetScore(View view) {
        scoreTeamA.reset();
        scoreTeamB.reset();

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);

        Toast.makeText(this, "Score are reset", Toast.LENGTH_SHORT).show();
    }
}
