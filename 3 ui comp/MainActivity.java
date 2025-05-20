package com.example.uicomponents;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    TextView result;
    Button submit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editName);
        password = findViewById(R.id.editPassword);
        result = findViewById(R.id.tvResult);
        submit = findViewById(R.id.buttonSubmit);

        submit.setOnClickListener(v -> {
            String n = name.getText().toString();
            String p = password.getText().toString();
            result.setText("Name: " + n + "\nPassword: " + p);
        });
    }
}
