package com.example.foodorder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodMenuDetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView costTextView;
    private TextView contentTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_menu_detail);


        Intent intent = getIntent();

        int articleID = intent.getIntExtra("FoodID", 0);

        FoodMenu foodMenu = FakeDatabase.getArticleById(articleID);

        nameTextView = findViewById(R.id.detailName);
        costTextView = findViewById(R.id.detailCost);
        contentTextView = findViewById(R.id.detailDescription);
        imageView = findViewById(R.id.detailImage);

        nameTextView.setText(foodMenu.getFoodName());
        costTextView.setText(foodMenu.getFoodCost());
        contentTextView.setText(foodMenu.getFoodDescription());

        imageView.setImageResource(foodMenu.getImageDrawableId());
    }
}
