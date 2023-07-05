package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView wistarecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WisataModel [] datawisata = new WisataModel[]{
                new WisataModel(R.drawable.candiprambanan,"Candi Prambanan", "Buka pukul 06.30 WIB", "Candi Prambanan adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wishnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah.", "Jl. Raya Solo - Yogyakarta No. 16"),
                new WisataModel(R.drawable.bhumimerapi,"Bhumi Merapi", "Buka pukul 09.00 WIB", "Agrowisata ini menawarkan konsep pertanian, perkebunan, dan peternakan, sehingga para pengunjung juga bisa mendapatkan banyak ilmu.", "Hargobinangun, Pakem, Sleman"),
                new WisataModel(R.drawable.waterboomjogja,"Waterboom Jogja", "Buka pukul 09.00 WIB", "Waterboom Jogja adalah alah satu waterpark terbesar di asia tenggara yang berlokasi di kota wisata terbesar kedua di Indonesia yaitu Yogyakarta.Waterboom Jogja telah tersertifikasi CHSE (Clean, Health, Safety, & Enviroment) dengan score 100% dari Kemenparekraf RI dan Sucofindo.", "Jenengan, Maguwoharjo, Sleman"),
                new WisataModel(R.drawable.museumullen,"Museum Ullen", "Buka pukul 08.30 WIB", "Museum Ullen Sentalu adalah tempat wisata di Sleman, yang menyajikan nilai sejarah yang edukatif, dalam balutan keseruan wisata yang cocok untuk semua usia.", "Hargobinangun, Pakem, Sleman"),
        };

        wistarecyclerview = findViewById(R.id.recycleview);
        WisataAdapter wisataadpter = new WisataAdapter(datawisata);
        wistarecyclerview.setLayoutManager(new LinearLayoutManager(this));
        wistarecyclerview.setAdapter(wisataadpter);

    };
}