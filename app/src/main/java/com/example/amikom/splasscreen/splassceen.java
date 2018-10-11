package com.example.amikom.splasscreen;

import android.content.Intent;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amikom.splasscreen.util.PreferencesHelper;

public class splassceen extends AppCompatActivity {

    PreferencesHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splassceen);

        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!instance.isLogin()) {
                    startActivity(new Intent(splassceen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(splassceen.this, MainActivity.class));
                }
            }
        },splashInterval);
    }
}

