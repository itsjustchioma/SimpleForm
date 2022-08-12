package com.example.simpleform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameField, emailField, courseField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = (EditText) findViewById(R.id.nameField);
        emailField = (EditText) findViewById(R.id.emailField);
        courseField = (EditText) findViewById(R.id.courseField);
    }

    public void buttonSenderPressed(View v){
        Intent senderIntent = new Intent(this, SecondActivity.class);
        senderIntent.putExtra("NAME", nameField.getText().toString());
        senderIntent.putExtra("EMAIL", emailField.getText().toString());
        senderIntent.putExtra("COURSE", courseField.getText().toString());
        startActivity(senderIntent);
    }
}