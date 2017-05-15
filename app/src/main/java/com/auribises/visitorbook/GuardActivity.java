package com.auribises.visitorbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GuardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guard);
    }
    public void registerClickHandler(View view) {
        Intent i = new Intent(GuardActivity.this, GuardActivity.class);
        startActivity(i);
        finish();
    }
    }
