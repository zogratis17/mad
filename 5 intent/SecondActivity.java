package com.example.intentapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView user = findViewById(R.id.textView1);
        TextView pass = findViewById(R.id.textView2);

        user.setText("Username: " + getIntent().getStringExtra("username"));
        pass.setText("Password: " + getIntent().getStringExtra("password"));
    }
}
