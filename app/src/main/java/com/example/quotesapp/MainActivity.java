package com.example.quotesapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.categories.CategoriesAdapter;
import com.example.quotesapp.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);
       categoriesRecyclerView.setHasFixedSize(true);
       categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        CategoriesList loveCategory = new CategoriesList("Nature Love",R.drawable.naturelove);
        categoriesLists.add(loveCategory);

        CategoriesList motivationCategory = new CategoriesList("Motivation",R.drawable.motivation);
        categoriesLists.add(motivationCategory);

        CategoriesList successCategory = new CategoriesList("Success",R.drawable.success);
        categoriesLists.add(successCategory);

        CategoriesList educationCategory = new CategoriesList("Education",R.drawable.education);
        categoriesLists.add(educationCategory);

        CategoriesList lifeCategory = new CategoriesList("Life",R.drawable.life);
        categoriesLists.add(lifeCategory);

        CategoriesList friendshipCategory = new CategoriesList("Friendship",R.drawable.friendship);
        categoriesLists.add(friendshipCategory);

        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists,MainActivity.this));
    }
}