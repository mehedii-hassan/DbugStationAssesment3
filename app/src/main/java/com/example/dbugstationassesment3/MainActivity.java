package com.example.dbugstationassesment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.dbugstationassesment3.adapters.CategoryAdapter;
import com.example.dbugstationassesment3.adapters.PosterAdapter;
import com.example.dbugstationassesment3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] categoryNames;
    private CategoryAdapter categoryAdapter;
    private PosterAdapter posterAdapter;

    int[] posterImages = {R.drawable.img, R.drawable.img, R.drawable.img, R.drawable.img};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        categoryNames = getResources().getStringArray(R.array.CategoryNames);

        categoryAdapter = new CategoryAdapter(categoryNames);
        binding.rvId.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL, false));
        binding.rvId.setAdapter(categoryAdapter);

        posterAdapter = new PosterAdapter(posterImages);
        binding.rvPoster.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.rvPoster.setAdapter(posterAdapter);


    }
}