package com.example.androiduielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText firstName,lastname;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit=findViewById(R.id.btnSubmit);
        firstName=findViewById(R.id.firstName);
        lastname=findViewById(R.id.lastName);
        txtDisplay=findViewById(R.id.txtDisplay);

        btnSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtDisplay.setText(firstName.getText()+" "+lastname.getText());
//                        firstName.setText("");
//                        lastname.setText("");
                    }
                }
        );
    }
}