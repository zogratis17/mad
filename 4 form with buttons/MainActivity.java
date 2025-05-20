package com.example.formbuttons;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, password, address, age;
    RadioGroup genderGroup;
    TextView result;
    Button submit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editName);
        password = findViewById(R.id.editPassword);
        address = findViewById(R.id.editAddress);
        age = findViewById(R.id.editAge);
        genderGroup = findViewById(R.id.radioGender);
        result = findViewById(R.id.tvResult);
        submit = findViewById(R.id.buttonSubmit);

        submit.setOnClickListener(v -> {
            int selectedId = genderGroup.getCheckedRadioButtonId();
            RadioButton gender = findViewById(selectedId);

            result.setText("Name: " + name.getText() +
                           "\nPassword: " + password.getText() +
                           "\nAddress: " + address.getText() +
                           "\nAge: " + age.getText() +
                           "\nGender: " + gender.getText());
        });
    }
}
