package com.example.saniyasunitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button convert;
    private EditText kg;
    private TextView pound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert=findViewById(R.id.convert);
        kg=findViewById(R.id.userInputKg);
        pound=findViewById(R.id.kgText2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inKG= Integer.parseInt(kg.getText().toString());
                double inPound=inKG*2.205;
                pound.setText("Equivalent Pound is "+inPound);
            }
        });

    }
}