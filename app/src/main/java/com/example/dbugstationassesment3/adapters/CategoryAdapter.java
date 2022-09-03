package com.example.dbugstationassesment3.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbugstationassesment3.databinding.RowDesignBinding;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    String[] categoryNames;

    public CategoryAdapter(String[] categoryNames) {
        this.categoryNames = categoryNames;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowDesignBinding binding = RowDesignBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new CategoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.binding.btnRowItem.setText(categoryNames[position]);

    }

    @Override
    public int getItemCount() {
        return categoryNames.length;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        private RowDesignBinding binding;

        public CategoryViewHolder(RowDesignBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
