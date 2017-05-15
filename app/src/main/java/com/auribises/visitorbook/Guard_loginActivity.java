package com.auribises.visitorbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Guard_loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guard_login);
    }
    public void registerClickHandler(View view){
        Intent i = new Intent(Guard_loginActivity.this,Guard_loginActivity.class);
        startActivity(i);
        finish();
    }
}
