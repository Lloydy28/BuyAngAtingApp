package com.firstapp.myclothingline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void signing(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(LoginActivity.this,LoginActivity .class));
    }
}


