package com.test.hmsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard_activity);

        ListView startersList = findViewById(R.id.list_view_leaderboard);

        Leaderboard[] leaderboards ={
                new Leaderboard("John", 1000),
                new Leaderboard("Mac", 850),
                new Leaderboard("Lola", 900),

        };

        ArrayAdapter<Leaderboard> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, leaderboards);
        startersList.setAdapter(adapter);
    }
}