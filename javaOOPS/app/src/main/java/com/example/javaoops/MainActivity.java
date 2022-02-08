package com.example.javaoops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Student s1=new Student(25,"Saniya","Memon",8731884);
        Log.i("Student ID:",Integer.toString(s1.getStudentID()));
       Log.i("Full Name:",s1.getFullName());
    }
}