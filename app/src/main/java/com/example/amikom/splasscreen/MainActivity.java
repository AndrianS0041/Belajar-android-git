package com.example.amikom.splasscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.amikom.splasscreen.activity.AddUserActivity;
import com.example.amikom.splasscreen.activity.DetailActivity;
import com.example.amikom.splasscreen.util.PreferencesHelper;

public class MainActivity extends AppCompatActivity {

    private Button buttonChange;
    private Button buttonChangeFragment;
    private Button buttonAddUser;
    private Button buttonListUser;
    private EditText editText;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChange = findViewById(R.id.changeActivity);
        buttonChangeFragment = findViewById(R.id.changeFragmentActivity);
        editText = findViewById(R.id.inputText);
        name = findViewById(R.id.etName);
        buttonAddUser = findViewById(R.id.addUser);
        buttonListUser = findViewById(R.id.listUser);

        name.setText("Hello : "+PreferencesHelper.getInstance(getApplicationContext()).getName());

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("keyhello", editText.getText().toString());
                startActivity(intent);
            }
        });

        buttonChangeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WithFragmentActivity
                        .class);
                startActivity(intent);
            }
        });

        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(intent);
            }
        });

        buttonListUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

    }
}
