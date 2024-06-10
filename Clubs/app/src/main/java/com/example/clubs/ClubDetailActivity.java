package com.example.clubs;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ClubDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);

        TextView name = findViewById(R.id.detailName);
        TextView stadium = findViewById(R.id.detailStadium);
        TextView coach = findViewById(R.id.detailCoach);
        TextView foundedYear = findViewById(R.id.detailFoundedYear);

        name.setText(getIntent().getStringExtra("name"));
        stadium.setText(getIntent().getStringExtra("stadium"));
        coach.setText(getIntent().getStringExtra("coach"));
        foundedYear.setText(getIntent().getStringExtra("foundedYear"));
    }
}
