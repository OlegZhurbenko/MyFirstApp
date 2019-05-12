package com.example.mirage.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SecondActivity extends Activity {

    private Button button;
    private EditText editText;


    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button)findViewById(R.id.button3);
        editText = (EditText) findViewById(R.id.editText);
        editText.setText(getIntent().getStringExtra("time"));
/*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
*/


    }

    public void onBack(View view) {

        //Intent intent = new Intent(this, MainActivity.class);
        //intent.addFlags(intent.FLAG_ACTIVITY_SINGLE_TOP);
        //startActivity(intent);
        finish();
    }
}
