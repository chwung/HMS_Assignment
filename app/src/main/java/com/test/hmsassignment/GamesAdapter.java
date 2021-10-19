package com.test.hmsassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GamesViewHolder> {
    private final Games[] games;

    public GamesAdapter(Games[] games){
        this.games = games;
    }

    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.games_item, parent, false);
        return new GamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesViewHolder holder, int position) {
        holder.bind(games[position]);
    }

    @Override
    public int getItemCount() {
        return games.length;
    }

    public static class GamesViewHolder extends RecyclerView.ViewHolder{
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public GamesViewHolder(@NonNull View itemView) {
            super(itemView);

            appImage = itemView.findViewById(R.id.image_view_game_icon);
            appTitle = itemView.findViewById(R.id.text_view_game_title);
            appDescription = itemView.findViewById(R.id.text_view_game_description);
        }

        public void bind(Games games){
            appTitle.setText(games.title);
            appDescription.setText(games.description);
            appImage.setImageResource(games.image);
        }
    }
}
