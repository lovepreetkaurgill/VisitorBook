package com.auribises.visitorbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerClickHandler(View view) {
        Intent i = new Intent(MainActivity.this, Admin_loginActivity.class);
        startActivity(i);
        finish();
    }

}


