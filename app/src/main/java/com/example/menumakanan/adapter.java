package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    String data1[], data2[], data3[];
    int potos[];
    Context konteks;

    public adapter(Context ct, String s1[], String s2[], String s3[], int poto[]) {
        data1 = s1;
        data2 = s2;
        data3 = s3;
        konteks = ct;
        potos = poto;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(konteks);
        View view = inflater.inflate(R.layout.baris, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namamakan.setText(data1[position]);
        holder.harga.setText(data2[position]);
        holder.menus.setImageResource(potos[position]);

        holder.layoutbaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(konteks, descmenu.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("data3",data3[position]);
                intent.putExtra("potos",potos[position]);
                konteks.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return potos.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView namamakan, harga;
        ImageView menus;
        ConstraintLayout layoutbaris;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            namamakan = itemView.findViewById(R.id.namamakan);
            harga = itemView.findViewById(R.id.harga);
            menus = itemView.findViewById(R.id.menus);
            layoutbaris = itemView.findViewById(R.id.layoutbaris);
        }
    }
}
