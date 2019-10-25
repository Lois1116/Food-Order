package com.example.foodorder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FoodMenuAdapter extends RecyclerView.Adapter<FoodMenuAdapter.ArticleViewHolder> {
    private ArrayList<FoodMenu> articlesToAdapt;

    public void setData(ArrayList<FoodMenu> articlesToAdapt) {
        this.articlesToAdapt = articlesToAdapt;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout, parent, false);

        ArticleViewHolder articleViewHolder = new ArticleViewHolder(view);
        return articleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {

        final FoodMenu foodMenuAtPosition = articlesToAdapt.get(position);

        holder.nameTextView.setText(foodMenuAtPosition.getFoodName());
        holder.costTextView.setText(foodMenuAtPosition.getFoodCost());
        holder.foodImageView.setImageResource(foodMenuAtPosition.getImageDrawableId());



        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodMenuDetailActivity.class);
                intent.putExtra("FoodID", foodMenuAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return articlesToAdapt.size();
    }


    public static class ArticleViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView costTextView;
        public ImageView foodImageView;


        public ArticleViewHolder(View v) {
            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.name);
            costTextView = v.findViewById(R.id.cost);
            foodImageView = v.findViewById(R.id.foodPhoto);

        }
    }
}
