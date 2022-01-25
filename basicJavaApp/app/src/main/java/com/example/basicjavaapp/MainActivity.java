package com.example.basicjavaapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int myNumber=786;
        if (myNumber % 2 == 0){
            Toast.makeText(getApplicationContext(), Integer.toString(myNumber)+" is EVEN", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(getApplicationContext(), Integer.toString(myNumber)+" is ODD", Toast.LENGTH_SHORT).show();
        }
        int numberRows=7;
        for(int i=numberRows; i>0; i--)
        {
            String t = "";
            for(int j=0; j<i; j++)
            {
                t = t + "*";
            }
             t=  t + "\n";
            Log.i("Assignment 2:",t);
        }
    }
}