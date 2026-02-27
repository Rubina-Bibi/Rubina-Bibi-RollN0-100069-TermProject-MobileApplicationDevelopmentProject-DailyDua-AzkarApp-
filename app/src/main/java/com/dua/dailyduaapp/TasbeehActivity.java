package com.dua.dailyduaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TasbeehActivity extends AppCompatActivity {

    private int count = 0; // Ginti ke liye variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbeeh);

        // System bars fix (Status bar padding)
        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // XML elements ko connect karna
        TextView tvCount = findViewById(R.id.tvCount);
        Button btnTap = findViewById(R.id.btnTap);
        Button btnReset = findViewById(R.id.btnReset);

        // TAP Button dabane par ginti badhegi
        btnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvCount.setText(String.valueOf(count));
            }
        });

        // RESET Button dabane par ginti zero ho jayegi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                tvCount.setText("0");
            }
        });
    }
}