package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class descmenu extends AppCompatActivity {

    ImageView menus2;
    TextView namamakan2, harga2, deskripsi;

    String data1, data2, data3;
    int potos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descmenu);

        menus2 = findViewById(R.id.menus2);
        namamakan2 = findViewById(R.id.namamakan2);
        harga2 = findViewById(R.id.harga2);
        deskripsi = findViewById(R.id.deskripsi);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("potos") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("data3")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            potos = getIntent().getIntExtra("potos", 1);
        }
        else {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        namamakan2.setText(data1);
        harga2.setText(data2);
        deskripsi.setText(data3);
        menus2.setImageResource(potos);
    }
}