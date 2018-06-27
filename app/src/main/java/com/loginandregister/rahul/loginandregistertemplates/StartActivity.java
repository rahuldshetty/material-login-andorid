package com.loginandregister.rahul.loginandregistertemplates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private Button loginBtn , registerBtn;
    private EditText usernameField , passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        loginBtn = findViewById(R.id.start_loginBtn);
        registerBtn = findViewById(R.id.start_regBtn);

        usernameField = findViewById(R.id.start_usernameField);
        passwordField = findViewById(R.id.start_passwordField);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Write your Login Page code
                Toast.makeText(StartActivity.this, "Login Button Pressed.", Toast.LENGTH_LONG).show();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Write your Register Page code
                Toast.makeText(StartActivity.this, "Register Button Pressed.", Toast.LENGTH_LONG).show();
            }
        });




    }
}
