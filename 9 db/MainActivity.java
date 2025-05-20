package com.example.sqliteapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, location, designation;
    Button save;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.txtName);
        location = findViewById(R.id.txtLocation);
        designation = findViewById(R.id.txtDesignation);
        save = findViewById(R.id.btnSave);

        save.setOnClickListener(v -> {
            DbHandler db = new DbHandler(MainActivity.this);
            db.insertUser(name.getText().toString(),
                          location.getText().toString(),
                          designation.getText().toString());
            Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_SHORT).show();
        });
    }
}
