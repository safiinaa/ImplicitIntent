package com.example.tugasrecyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ViewHolder> {

    WisataModel [] wisatalist;

    public WisataAdapter(WisataModel[] wisatalist) {
        this.wisatalist = wisatalist;
    }

    @NonNull
    @Override
    public WisataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View listwisata = layoutInflater.inflate(R.layout.item_wisata,null);

        ViewHolder viewHolder = new ViewHolder((listwisata));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.ViewHolder holder, int position) {
        WisataModel wisataModel = wisatalist[position];
        holder.gmbrwisata.setImageResource(wisataModel.getGmbrwisata());
        holder.tvnamawisata.setText(wisataModel.getTvnamawisata());
        holder.tvjam.setText(wisataModel.getTvjam());
        holder.tvdeskripsi.setText(wisataModel.getTvdeskripsi());
        holder.tvalamat.setText(wisataModel.getTvalamat());

        holder.maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("Gambar", wisataModel.getGmbrwisata());
                intent.putExtra("Nama Wisata", wisataModel.getTvnamawisata());
                intent.putExtra("Jam Buka", wisataModel.getTvjam());
                intent.putExtra("Deskripsi", wisataModel.getTvdeskripsi());
                intent.putExtra("Alamat", wisataModel.getTvalamat());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return wisatalist.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gmbrwisata;
        TextView tvnamawisata, tvjam, tvdeskripsi, tvalamat;
        CardView maincard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gmbrwisata = itemView.findViewById(R.id.gmbrwisata);
            tvnamawisata = itemView.findViewById(R.id.tvnamawisata);
            tvjam= itemView.findViewById(R.id.tvjam);
            tvdeskripsi = itemView.findViewById(R.id.tvdeskrpsi);
            tvalamat = itemView.findViewById(R.id.tvalamat);
            maincard = itemView.findViewById(R.id.maincard);
        }
    }

}
