package com.example.sendsms;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(v -> {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage("5554", null, "Hello from Android!", null, null);
        });
    }
}
