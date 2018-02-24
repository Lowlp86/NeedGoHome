package com.sb.needgohome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonMessage;
    private Button buttonCallme;
    private Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMessage = (Button) findViewById(R.id.button);
        buttonCallme  = (Button) findViewById(R.id.button2);
        buttonExit    = (Button) findViewById(R.id.button3);

        buttonMessage.setOnClickListener(this);
        buttonExit.setOnClickListener(this);
        buttonCallme.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, MessageActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, CallmeActivity.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "Good Bye", Toast.LENGTH_LONG).show();
                finish();
        }
    }
}
