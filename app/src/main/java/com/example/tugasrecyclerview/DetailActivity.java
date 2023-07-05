package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView gambar;
    TextView tvnamawisata, tvjambuka, tvdeskripsi, tvalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        gambar = findViewById(R.id.gambar);
        tvnamawisata = findViewById(R.id.tvnamawisata);
        tvjambuka = findViewById(R.id.tvjambuka);
        tvdeskripsi = findViewById(R.id.tvdeskripsi);
        tvalamat = findViewById(R.id.tvalamat);

        int gambarwst = getIntent().getIntExtra("Gambar", 0);
        gambar.setImageResource(gambarwst);
        tvnamawisata.setText(getIntent().getExtras().getString("Nama Wisata"));
        tvjambuka.setText(getIntent().getExtras().getString("Jam Buka"));
        tvdeskripsi.setText(getIntent().getExtras().getString("Deskripsi"));
        tvalamat.setText(getIntent().getExtras().getString("Alamat"));

        tvalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/t66KwqkWRutPF4op8"));
                startActivity(Intent.createChooser(intent, "Alamat"));
            }
        });
    }
}