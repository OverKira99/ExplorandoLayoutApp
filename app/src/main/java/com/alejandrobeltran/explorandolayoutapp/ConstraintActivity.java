package com.alejandrobeltran.explorandolayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintActivity extends AppCompatActivity {

    private Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        btnMenu = findViewById(R.id.btn_menuCons);
    }
    public void clickMenuCons(View view){
        Intent miintent = new Intent(ConstraintActivity.this, MainActivity.class);
        startActivity(miintent);
    }

}