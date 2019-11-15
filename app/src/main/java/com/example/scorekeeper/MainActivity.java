package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeGoals = 0;
    int guestGoals = 0;
    int homeFouls = 0;
    int guestFouls = 0;
    int homeYellowCards = 0;
    int guestYellowCards = 0;
    int homeRedCards = 0;
    int guestRedCards = 0;
    int homeCorners = 0;
    int guestCorners = 0;
    int homeOffsides = 0;
    int guestOffsides = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given stat.
     */
    public void display(int stat, int id) {
        TextView statView = (TextView) findViewById(id);
        statView.setText(String.valueOf(stat));
    }

    public void addHomeGoal(View view) {
        homeGoals += 1;
        display(homeGoals, R.id.home_goals);
    }

    public void addGuestGoal(View view) {
        guestGoals += 1;
        display(guestGoals, R.id.guest_goals);
    }

    public void addHomeFoul(View view) {
        homeFouls += 1;
        display(homeFouls, R.id.home_fouls);
    }

    public void addGuestFoul(View view) {
        guestFouls += 1;
        display(guestFouls, R.id.guest_fouls);
    }

    public void addHomeYellowCard(View view) {
        homeYellowCards += 1;
        display(homeYellowCards, R.id.home_yellow_cards);
    }

    public void addGuestYellowCard(View view) {
        guestYellowCards += 1;
        display(guestYellowCards, R.id.guest_yellow_cards);
    }

    public void addHomeRedCard(View view) {
        homeRedCards += 1;
        display(homeRedCards, R.id.home_red_cards);
    }

    public void addGuestRedCard(View view) {
        guestRedCards += 1;
        display(guestRedCards, R.id.guest_red_cards);
    }

    public void addHomeCorner(View view) {
        homeCorners += 1;
        display(homeCorners, R.id.home_corners);
    }

    public void addGuestCorner(View view) {
        guestCorners += 1;
        display(guestCorners, R.id.guest_corners);
    }

    public void addHomeOffside(View view) {
        homeOffsides += 1;
        display(homeOffsides, R.id.home_offsides);
    }

    public void addGuestOffside(View view) {
        guestOffsides += 1;
        display(guestOffsides, R.id.guest_offsides);
    }

    public void startNewGame(View view) {
        homeGoals = 0;
        guestGoals = 0;
        homeFouls = 0;
        guestFouls = 0;
        homeYellowCards = 0;
        guestYellowCards = 0;
        homeRedCards = 0;
        guestRedCards = 0;
        homeCorners = 0;
        guestCorners = 0;
        homeOffsides = 0;
        guestOffsides = 0;
        display(guestGoals, R.id.guest_goals);
        display(homeGoals, R.id.home_goals);
        display(guestFouls, R.id.guest_fouls);
        display(homeFouls, R.id.home_fouls);
        display(guestYellowCards, R.id.guest_yellow_cards);
        display(homeYellowCards, R.id.home_yellow_cards);
        display(guestRedCards, R.id.guest_red_cards);
        display(homeRedCards, R.id.home_red_cards);
        display(guestCorners, R.id.guest_corners);
        display(homeCorners, R.id.home_corners);
        display(guestOffsides, R.id.guest_offsides);
        display(homeOffsides, R.id.home_offsides);
    }
}
