package com.alejandrobeltran.explorandolayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnConstraint ,btnTable,  btnProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConstraint = findViewById(R.id.btn_ConstraintLayout);
        btnTable = findViewById(R.id.btn_tableLayput);
        btnProfile = findViewById(R.id.btn_ProfileLayout);
    }
    public void clickConstrain(View view){
        Intent miintent = new Intent(MainActivity.this , ConstraintActivity.class);
        startActivity(miintent);

    }
    public void clickTable(View view){
        Intent miintent = new Intent(MainActivity.this , TableActivity.class);
        startActivity(miintent);


    }
    public void clickProfile(View view){
        Intent miintent = new Intent(MainActivity.this , ProfileActivity.class);
        startActivity(miintent);
    }
}