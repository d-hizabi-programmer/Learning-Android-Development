package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String myName="Saniya Memon";
         int hoursTravelled=8;
        double speed=40.60;
        double distance=hoursTravelled*speed;

         Log.d("Activity Lifecycle",".onCreate() triggered. Activity Created!");
        Toast.makeText(getApplicationContext(), myName, Toast.LENGTH_SHORT).show();
        Log.d("Distance",
                "Total Distance Covered:"+Double.toString(distance));
    }

        protected void onStart() {
        super.onStart();//soon be visible
        Log.d("Activity Lifecycle","onStart() triggered.Activity Started!");
    }

    @Override

    protected void onPause() {

        super.onPause();//invisible

        Log.d("Activity Lifecycle","onPause() triggered. Activity Paused!");

    }

    @Override

    protected void onStop() {

        super.onStop();

        Log.d("Activity Lifecycle","onStop() triggered. Activity Stopped!");

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();

        Log.d("Activity Lifecycle","onDestroy() triggered. Activity Destroyed!");

    }




}