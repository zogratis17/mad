package com.example.radiobuttonsapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton sound, vibrate, silent;
    TextView result;
    Button choose;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.myRadioGroup);
        sound = findViewById(R.id.sound);
        vibrate = findViewById(R.id.vibrate);
        silent = findViewById(R.id.silent);
        result = findViewById(R.id.textView1);
        choose = findViewById(R.id.button1);

        choose.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton selected = findViewById(selectedId);
            result.setText("You chose: " + selected.getText());
        });
    }
}
