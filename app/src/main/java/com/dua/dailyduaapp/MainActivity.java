package com.dua.dailyduaapp;

import android.content.Intent; // Required for navigating between pages
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DuaAdapter adapter;
    List<Dua> fullList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize UI components and link them with XML IDs
        recyclerView = findViewById(R.id.recyclerView);
        SearchView searchView = findViewById(R.id.searchView);

        // Find the button that opens the Azkar screen
        Button btnGoToAzkar = findViewById(R.id.btnAzkar);

        // 2. Fetch the complete list of Duas from the data source
        fullList = DuaData.getAllDuas();

        // 3. Set up the RecyclerView with a LayoutManager and the Adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DuaAdapter(this, fullList);
        recyclerView.setAdapter(adapter);

        // 4. Click Listener to navigate from Main Screen to Azkar Screen
        btnGoToAzkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent defines the transition from current screen to AzkarActivity
                Intent intent = new Intent(MainActivity.this, AzkarActivity.class);
                startActivity(intent);
            }
        });

        // 5. Logic to handle search/filter functionality
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Filter the list whenever the user types a character
                filterList(newText);
                return true;
            }
        });
    }

    /**
     * Filters the Dua list based on user input in the search bar.
     * @param text The string entered by the user.
     */
    private void filterList(String text) {
        List<Dua> filteredList = new ArrayList<>();
        for (Dua dua : fullList) {
            // Check if the Dua name contains the search text (case-insensitive)
            if (dua.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(dua);
            }
        }
        // Update the adapter with the filtered results
        adapter.setFilteredList(filteredList);
    }
}