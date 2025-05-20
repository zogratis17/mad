package com.example.intentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editText1);
        EditText pass = findViewById(R.id.editText2);
        Button send = findViewById(R.id.button1);

        send.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("username", name.getText().toString());
            i.putExtra("password", pass.getText().toString());
            startActivity(i);
        });
    }
}
