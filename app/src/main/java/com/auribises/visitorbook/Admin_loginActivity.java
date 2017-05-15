package com.auribises.visitorbook;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Admin_loginActivity extends Activity {

    EditText User_id,Password;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User_id = (EditText) findViewById(R.id.editText1);
        Password = (EditText) findViewById(R.id.editText2);
        Login = (Button) findViewById(R.id.button1);

        Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String User_id = user_id.getText().toString();
                String Password = password.getText().toString();

                if (User_id.equals("admin") && Password.equals("admin")) {
                    Intent i = new Intent(getApplicationContext(), Admin_loginActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Userid/Password", Toast.LENGTH_LONG).show();
                }

            }
        });

    }}