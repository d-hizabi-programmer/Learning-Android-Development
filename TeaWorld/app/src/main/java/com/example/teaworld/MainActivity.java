package com.example.teaworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);
        TextView buy1 = findViewById(R.id.buy1);
         buy1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(getApplicationContext(),checkout_form.class);
                 startActivity(i);
             }
         });

        TextView buy2 = findViewById(R.id.buy2);
        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),checkout_form.class);
                startActivity(i);
            }
        });
        TextView buy3 = findViewById(R.id.buy3);
        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),checkout_form.class);
                startActivity(i);
            }
        });

    }
}