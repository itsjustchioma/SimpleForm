package com.example.simpleform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name1, email1, course1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name1 = (TextView) findViewById(R.id.answerName);
        email1 = (TextView) findViewById(R.id.answerEmail);
        course1 = (TextView) findViewById(R.id.answerCourse);

        Intent receiverIntent=getIntent();
        String receiverValue1 = receiverIntent.getStringExtra("NAME");
        String receiverValue2 = receiverIntent.getStringExtra("EMAIL");
        String receiverValue3 = receiverIntent.getStringExtra("COURSE");

        name1.setText(receiverValue1);
        email1.setText(receiverValue2);
        course1.setText(receiverValue3);
    }
}