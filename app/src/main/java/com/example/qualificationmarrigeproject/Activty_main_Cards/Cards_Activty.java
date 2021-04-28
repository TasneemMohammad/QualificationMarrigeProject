package com.example.qualificationmarrigeproject.Activty_main_Cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qualificationmarrigeproject.R;

import java.util.ArrayList;
import java.util.List;

public class Cards_Activty extends AppCompatActivity {
    RecyclerView rv_cards;
    List<Data_Class_Cards> list_cards;
    Recycler_Adapter_Cards adapter_cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards__activty);
       contentOf_rv();
        rv_cards = findViewById(R.id.rv_cards);
        list_cards = new ArrayList<>();
        list_cards.add(new Data_Class_Cards("Bef_Engagement" , R.drawable.ic_baseline_account_balance_24));
        list_cards.add(new Data_Class_Cards("Engagement" , R.drawable.ic_baseline_360_24));
        list_cards.add(new Data_Class_Cards("Marriage" , R.drawable.ic_baseline_home_24));
        list_cards.add(new Data_Class_Cards("Children" , R.drawable.ic_baseline_baby_changing_station_24));
       list_cards.add(new Data_Class_Cards("Test" , R.drawable.ic_baseline_child_care_24));
        adapter_cards = new Recycler_Adapter_Cards(this, list_cards);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rv_cards.setLayoutManager(gridLayoutManager);
        rv_cards.setAdapter(adapter_cards);
    }

    public void contentOf_rv (){

    }


}