package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void changeText(View v) {
        TextView dst = (TextView) findViewById(R.id.textView2);
        EditText src = (EditText) findViewById(R.id.editText);
        dst.setText(src.getText().toString());
    }
}
