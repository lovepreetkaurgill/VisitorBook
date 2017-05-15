package com.auribises.visitorbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher_loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
    }
    public void registerClickHandler(View view){
        Intent i = new Intent(Teacher_loginActivity.this,Teacher_loginActivity.class);
        startActivity(i);
        finish();
    }
}
