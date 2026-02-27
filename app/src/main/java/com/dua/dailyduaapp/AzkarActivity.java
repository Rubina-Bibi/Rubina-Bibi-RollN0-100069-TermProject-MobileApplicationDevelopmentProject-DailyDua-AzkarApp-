package com.dua.dailyduaapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AzkarActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DuaAdapter adapter;
    ArrayList<Dua> azkarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);

        // RecyclerView setup
        recyclerView = findViewById(R.id.azkarRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        azkarList = new ArrayList<>();

        // 10 Azkar complete list (Name, Category, Arabic, English)
        azkarList.add(new Dua("SubhanAllah", "Azkar", "سُبْحَانَ اللَّهِ", "Glory be to Allah"));
        azkarList.add(new Dua("Alhamdulillah", "Azkar", "الْحَمْدُ لِلَّهِ", "All praise is due to Allah"));
        azkarList.add(new Dua("Allahu Akbar", "Azkar", "اللَّهُ أَكْبَرُ", "Allah is the Greatest"));
        azkarList.add(new Dua("La ilaha illallah", "Azkar", "لَا إِلَهَ إِلَّا اللَّهُ", "There is no god but Allah"));
        azkarList.add(new Dua("Astaghfirullah", "Azkar", "أَسْتَغْفِرُ اللَّهَ", "I seek forgiveness from Allah"));
        azkarList.add(new Dua("Tasbih", "Azkar", "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ", "Glory be to Allah and Praise be to Him"));
        azkarList.add(new Dua("Hawqala", "Azkar", "لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللَّهِ", "There is no power or might except with Allah"));
        azkarList.add(new Dua("Tasbih Kabir", "Azkar", "سُبْحَانَ اللَّهِ الْعَظِيمِ", "Glory be to Allah the Supreme"));
        azkarList.add(new Dua("HasbiAllah", "Azkar", "حَسْبُنَا اللَّهُ وَنِعْمَ الْوَكِيلُ", "Allah is sufficient for us"));
        azkarList.add(new Dua("Darood", "Azkar", "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ", "O Allah, send blessings upon Muhammad"));

        // Adapter setup (Context aur List pass kar rahe hain)
        adapter = new DuaAdapter(this, azkarList);
        recyclerView.setAdapter(adapter);
    }
}