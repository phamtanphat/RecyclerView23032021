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
        Food food = mListFood.get(position);

        if (food.isStatus()){
            holder.imgIcon.setImageResource(R.drawable.ic_status_online);
        }else{
            holder.imgIcon.setImageResource(R.drawable.ic_status_offline);
        }
        holder.img.setImageResource(food.getImage());
        holder.tvName.setText(food.getName());
        holder.tvLocation.setText(food.getAddress());

        if (food.getSalesOff().length == 1){
            holder.tvSaleOff.setText(food.getSalesOff()[0]);
        }else if (food.getSalesOff().length <= 0){
            holder.tvSaleOff.setVisibility(View.GONE);
            holder.imgPriceTag.setVisibility(View.GONE);
            holder.viewSeparator.setVisibility(View.GONE);
            holder.tvMore.setVisibility(View.GONE);
        }else{
            holder.tvSaleOff.setText(food.getSalesOff()[0]);
            holder.tvMore.setText(String.format("Xem thêm %d ưu đãi khác",food.getSalesOff().length));
        }
    }

    @Override
    public int getItemCount() {
        if (mListFood != null && mListFood.size() > 0){
            return mListFood.size();
        }
        return 0;
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img,imgIcon,imgPriceTag;
        TextView tvName,tvLocation,tvSaleOff ,tvMore;
        View viewSeparator;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageViewFood);
            imgIcon = itemView.findViewById(R.id.imageViewIcon);
            tvName = itemView.findViewById(R.id.textViewNameFood);
            tvLocation = itemView.findViewById(R.id.textViewLocationFood);
            tvSaleOff = itemView.findViewById(R.id.textViewSaleOff);
            tvMore = itemView.findViewById(R.id.textViewViewMore);
            imgPriceTag = itemView.findViewById(R.id.imagePriceTag);
            viewSeparator = itemView.findViewById(R.id.viewSeparator);
        }
    }
}
