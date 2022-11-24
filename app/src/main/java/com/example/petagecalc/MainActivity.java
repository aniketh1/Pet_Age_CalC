package com.example.petagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View buttonView){
        buttonView = findViewById(R.id.button);
        TextView tx = findViewById(R.id.editTextTextPersonName), tx2 = findViewById(R.id.editTextTextPersonName2);
        int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(tx.getText().toString());
        int x = Integer.parseInt(tx.getText().toString());
        int y = Calendar.getInstance().get(Calendar.YEAR);
        if (x>y){
            Toast.makeText(this, "Your Pet is Not yet Born", Toast.LENGTH_SHORT).show();
        }
        else
        tx2.setText(age+"");


    }
}