package com.example.top_games_app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    ArrayList<GameModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        data = new ArrayList<GameModel>();

        data.add(new GameModel("Horizon Chase",R.drawable.card1));
        data.add(new GameModel("PUBG",R.drawable.card2));
        data.add(new GameModel("Head Ball 2",R.drawable.card3));

        data.add(new GameModel("Fifa 2022",R.drawable.card5));
        data.add(new GameModel("Fortnite",R.drawable.card6));
        data.add(new GameModel("Hooked on You",R.drawable.card4));

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        CustomAdapter adapter = new CustomAdapter(data,this);

        recyclerView.setAdapter(adapter);
    }
}