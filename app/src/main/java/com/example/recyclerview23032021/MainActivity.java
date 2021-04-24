package com.example.recyclerview23032021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> mFoodList;
    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoodList = new ArrayList<>();
        mFoodList.add(new Food(
                true,
                R.drawable.hinhplaydumsum,
                "Play Dim Sum - Thái Văn Lung",
                "12 -14 Thái Văn Lung, P. Bến Nghé, Quận 1",
                new String[] {
                        "Cả ngày - Giảm 20%",
                        "Ăn trưa - Ưu đãi",
                        "Cả ngày - Tặng 01 phần Bánh Nướng",
                        "Cả ngày - Đặt bàn"
                }));
        mFoodList.add(new Food(
                true,
                R.drawable.hinhmoobeefsteak,
                "Moo Beef Steak - Ngô Đức Kế",
                "35 - 37 Ngô Đức Kế, P. Bến Nghé, Quận 1",
                new String[] {
                        "Cả ngày - Giảm 50%",
                        "Cả ngày - T3 - CN: Giảm 15%"
                }));
        mFoodList.add(new Food(
                true,
                R.drawable.hinhkhezone,
                "Khè Zone",
                "1 Đồng Nai, P. 15, Quận 10",
                new String[] {
                        "Cả ngày - Giảm 30%"
                }));
        mFoodList.add(new Food(
                true,
                R.drawable.hinhsaigoncafe,
                "Saigon Cafe - Sheraton Saigon Hotel & Towers",
                "Tầng 1 Sheraton Saigon Hotel & Towers, 88 Đồng Khởi, P. Bến Nghé, Quận 1",
                new String[] {
                        "Ăn tối - T4 - CN: Giảm 15%",
                        "Ăn tối - T4 - CN: Giảm 10%"
                }));
        mFoodList.add(new Food(
                true,
                R.drawable.hinhmocrieuvanuong,
                "Mộc - Riêu & Nướng - Võ Văn Kiệt",
                "318 - 320 Võ Văn Kiệt (Gần Ngã 3 Đề Thám), P. Cô Giang, Quận 1",
                new String[] {}));
        mRcvFood = findViewById(R.id.recyclerViewFood);
        mFoodAdapter = new FoodAdapter(mFoodList);
        mRcvFood.setAdapter(mFoodAdapter);

        mFoodAdapter.setOnItemClickRecyclerView(new OnItemClickFood() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, mFoodList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}