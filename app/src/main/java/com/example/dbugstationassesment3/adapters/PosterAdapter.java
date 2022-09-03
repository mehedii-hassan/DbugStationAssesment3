package com.example.dbugstationassesment3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbugstationassesment3.databinding.PosterRowBinding;

public class PosterAdapter extends RecyclerView.Adapter<PosterAdapter.PosterViewHolder> {
    int[] posterImages;

    public PosterAdapter(int[] posterImages) {
        this.posterImages = posterImages;
    }

    @NonNull
    @Override
    public PosterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PosterRowBinding binding = PosterRowBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new PosterViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PosterViewHolder holder, int position) {
        holder.binding.ivPoster.setImageResource(posterImages[position]);

    }

    @Override
    public int getItemCount() {
        return posterImages.length;
    }

    class PosterViewHolder extends RecyclerView.ViewHolder {
        private PosterRowBinding binding;

        public PosterViewHolder(PosterRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
