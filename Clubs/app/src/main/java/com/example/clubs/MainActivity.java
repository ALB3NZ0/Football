package com.example.clubs;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FootballClubAdapter adapter;
    private List<FootballClub> footballClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        footballClubs = new ArrayList<>();
        footballClubs.add(new FootballClub("FC Barcelona", "Camp Nou", "Xavi", "1899"));
        footballClubs.add(new FootballClub("Real Madrid", "Santiago Bernabéu", "Carlo Ancelotti", "1902"));
        footballClubs.add(new FootballClub("Manchester United", "Old Trafford", "Erik ten Hag", "1878"));
        footballClubs.add(new FootballClub("Chelsea", "Stamford Bridge", "Mauricio Pochettino", "1905"));
        footballClubs.add(new FootballClub("Bayern Munich", "Allianz Arena", "Julian Nagelsmann", "1900"));
        footballClubs.add(new FootballClub("Juventus", "Allianz Stadium", "Massimiliano Allegri", "1897"));
        footballClubs.add(new FootballClub("Paris Saint-Germain", "Parc des Princes", "Luis Enrique", "1970"));
        footballClubs.add(new FootballClub("Liverpool", "Anfield", "Jürgen Klopp", "1892"));
        footballClubs.add(new FootballClub("Manchester City", "Etihad Stadium", "Pep Guardiola", "1880"));
        footballClubs.add(new FootballClub("Arsenal", "Emirates Stadium", "Mikel Arteta", "1886"));

        adapter = new FootballClubAdapter(this, footballClubs);
        recyclerView.setAdapter(adapter);
    }
}
