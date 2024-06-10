package com.example.clubs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FootballClubAdapter extends RecyclerView.Adapter<FootballClubAdapter.ViewHolder> {

    private List<FootballClub> footballClubs;
    private Context context;

    public FootballClubAdapter(Context context, List<FootballClub> footballClubs) {
        this.context = context;
        this.footballClubs = footballClubs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_football_club, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FootballClub club = footballClubs.get(position);
        holder.name.setText(club.getName());
        holder.stadium.setText(club.getStadium());
        holder.coach.setText(club.getCoach());
        holder.foundedYear.setText(club.getFoundedYear());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ClubDetailActivity.class);
            intent.putExtra("name", club.getName());
            intent.putExtra("stadium", club.getStadium());
            intent.putExtra("coach", club.getCoach());
            intent.putExtra("foundedYear", club.getFoundedYear());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return footballClubs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView stadium;
        public TextView coach;
        public TextView foundedYear;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.clubName);
            stadium = itemView.findViewById(R.id.clubStadium);
            coach = itemView.findViewById(R.id.clubCoach);
            foundedYear = itemView.findViewById(R.id.clubFoundedYear);
        }
    }
}
