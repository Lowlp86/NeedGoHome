package com.sb.needgohome;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText messageTitle;
    private EditText messageText;
    private Button messageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        messageTitle = (EditText) findViewById(R.id.messageTitle);
        messageText  = (EditText) findViewById(R.id.messageText);
        messageButton= (Button) findViewById(R.id.messageButton);

        messageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.messageButton:
                if (messageTitle.getText() != null) {
                    Toast.makeText(MessageActivity.this, "标题不能为空！", Toast.LENGTH_SHORT).show();
                    break;
                } else if (messageText.getText() != null) {
                    Toast.makeText(MessageActivity.this, "内容不能为空！", Toast.LENGTH_SHORT).show();
                    break;
                }
                final String title = messageTitle.getText().toString();
                final String text  = messageText.getText().toString();

                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                Notification notification = new NotificationCompat.Builder(this)
                        .setContentTitle(title)
                        .setContentText(text)
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .build();
                manager.notify(1, notification);
                break;
        }
    }
}

