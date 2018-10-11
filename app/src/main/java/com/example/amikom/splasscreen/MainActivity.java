package com.example.amikom.splasscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nama;
    private String KEY_NAME = "NAMA";
    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (TextView) findViewById(R.id.hello);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        hello.setText("Hello, " + nama + " !");
    }

    public void toAct(View view) {
        Intent pindahAct = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(pindahAct);
    }

    public void toFrg(View view) {
        Intent pindahFrg = new Intent(MainActivity.this, Activity_fragment.class);
        startActivity(pindahFrg);
    }
}
