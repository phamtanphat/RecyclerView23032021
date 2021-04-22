package com.example.recyclerview23032021;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter {


    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img,imgIcon;
        TextView tvName,tvLocation,tvSaleOff ,tvMore;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageViewFood);
            imgIcon = itemView.findViewById(R.id.imageViewIcon);
            tvName = itemView.findViewById(R.id.textViewNameFood);
            tvLocation = itemView.findViewById(R.id.textViewLocationFood);
            tvSaleOff = itemView.findViewById(R.id.textViewSaleOff);
            tvMore = itemView.findViewById(R.id.textViewViewMore);
        }
    }
}
