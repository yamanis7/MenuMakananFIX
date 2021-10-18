package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    String s1[], s2[], s3[];
    int poto[] = {R.drawable.nasgor,R.drawable.bakso,R.drawable.nasyam,R.drawable.esteh,R.drawable.esjeruk, R.drawable.aqua};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.menu_makanan);
        s2 = getResources().getStringArray(R.array.hargaa);
        s3 = getResources().getStringArray(R.array.desc);

        adapter adapter = new adapter(this, s1, s2, s3, poto);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}