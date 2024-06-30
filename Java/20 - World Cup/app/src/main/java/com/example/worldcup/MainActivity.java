package com.example.worldcup;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    ArrayList<CountryModel> dataModels = new ArrayList<CountryModel>();

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

        listView = findViewById(R.id.listview);

        dataModels.add(new CountryModel("brazil","5", R.drawable.brazil));
        dataModels.add(new CountryModel("Germany","4",R.drawable.germany));
        dataModels.add(new CountryModel("France","2",R.drawable.france));
        dataModels.add(new CountryModel("Spain","1",R.drawable.spain));
        dataModels.add(new CountryModel("England","1",R.drawable.unitedkingdom));
        dataModels.add(new CountryModel("United States","0",R.drawable.unitedstates));
        dataModels.add(new CountryModel("Saudi Arabia","0",R.drawable.saudiarabia));

        CustomAdapter adapter = new CustomAdapter(dataModels,this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),adapter.getItem(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}