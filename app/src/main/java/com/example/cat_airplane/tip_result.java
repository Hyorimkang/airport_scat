package com.example.cat_airplane;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class tip_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_result);
        //타이틀 바 없애기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}