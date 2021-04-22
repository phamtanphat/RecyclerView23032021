package com.example.recyclerview23032021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    private List<Food> mListFood;

    public FoodAdapter(List<Food> mListFood) {
        this.mListFood = mListFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.layout_item_food,parent,false);
        return new FoodViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mListFood != null && mListFood.size() > 0){
            return mListFood.size();
        }
        return 0;
    }

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
