package com.example.teaworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void callingAnotherActivity(){
        Intent i=new Intent(getApplicationContext(),checkout_form.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button turkishBtn=findViewById(R.id.turkish_buy);
        Button tandoorBtn=findViewById(R.id.tandoor_buy);
        Button indianBtn=findViewById(R.id.indian_buy);

        turkishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callingAnotherActivity();
            }
        });
        tandoorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callingAnotherActivity();
            }
        });
        indianBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callingAnotherActivity();
            }
        });

    }
}