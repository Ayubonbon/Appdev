package com.ayushi.loginscreen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


import androidx.navigation.ui.AppBarConfiguration;

import com.ayushi.loginscreen.databinding.ActivityMainBinding;


public class LoginActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnlogin = findViewById(R.id.btnlogin);
        // click listener for button login
        btnlogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                onRegisterClick();
            }
        });
    }

    private void onRegisterClick() {
    }
}





