package com.example.nils.rushhour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //public void onSaveInstanceState() {
    //    // do something
    //}

    public void goToPlayOverview(View view) {
        Intent goToPlayOverview = new Intent(this, PlayOverviewActivity.class);
        startActivity(goToPlayOverview);
        // finish(); // ?
    }

    public void goToScoreOverview(View view) {
        //Intent goToScoreOverview = new Intent(this, ScoreOverviewActivity.class);
        //startActivity(goToScoreOverview);
        // finish(); // ?
    }

    public void goToAchievements(View view) {
        Intent goToAchievements = new Intent(this, AchievementsActivity.class);
        startActivity(goToAchievements);
        // finish(); // ?
    }

    public void goToInstructions(View view) {
        Intent goToInstructions = new Intent(this, InstructionsActivity.class);
        startActivity(goToInstructions);
        // finish(); // ?
    }
}
