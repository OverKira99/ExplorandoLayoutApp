package com.alejandrobeltran.explorandolayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    private Button btnMenuProf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnMenuProf = findViewById(R.id.btn_menuProf);
    }
    public void clickMenuTable(View view){
        Intent miintent = new Intent(ProfileActivity.this , MainActivity.class);
        startActivity(miintent);
    }
}