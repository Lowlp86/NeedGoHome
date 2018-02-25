package com.sb.needgohome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CallmeActivity extends AppCompatActivity {

    private Button callmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callme);

        callmeButton = (Button) findViewById(R.id.callmeButton);

        callmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CallmeActivity.this, "不好意思， 此功能还未被开发", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
