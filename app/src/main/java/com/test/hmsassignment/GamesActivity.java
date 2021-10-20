package com.test.hmsassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_games);

        Games[] games = {
                new Games("Tic Tac Toe Game", "Tic-Tac-Toe is a game with Xs and Os that which places three of their marks horizontal, vertical, or diagonal row is the winner.", R.drawable.ticktacktoe),
                new Games("Snake Game", "Snake that roams around on a bordered plane, picking up food and  trying to avoid hitting its own tail or the edges of the playing area.", R.drawable.snakegame),
                new Games("Speed Test Game", "To test how fast are you in this game", R.drawable.speedgame),
        };

        GamesAdapter adapter = new GamesAdapter(games);
        recyclerView.setAdapter(adapter);

    }
}