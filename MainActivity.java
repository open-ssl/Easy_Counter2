package com.example.stanislavlukanov.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    private TextView mHelloTextView;
    private TextView mCountTextView;
    private Button mButton;
    private Button mButtonClick;
    private int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.textView);
        mCountTextView = findViewById(R.id.tv_Count);
        mButton = findViewById(R.id.button);
        mButtonClick = findViewById(R.id.button_count);
        mButtonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountTextView.setText("I saw " + (++mCount)+ " clicks");
            }
        });
    }


    public void onClick(View view) {
        mHelloTextView.setText("Hello Stas!");
    }
}
