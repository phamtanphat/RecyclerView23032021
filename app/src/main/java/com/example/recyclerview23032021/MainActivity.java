package com.example.recyclerview23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> mFoodList;
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
                }
                ));

    }
}