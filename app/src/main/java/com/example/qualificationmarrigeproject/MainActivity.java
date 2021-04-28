package com.example.qualificationmarrigeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qualificationmarrigeproject.Activty_main_Cards.Cards_Activty;

//login
public class MainActivity extends AppCompatActivity {
    Button btn_login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btn_login);
      btn_login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this , Cards_Activty.class);
              startActivity(intent);
          }
      });

    }
}
