package com.example.mirage.myfirstapp;
/*
* @autor Yo
* @version 03.05.2019
 */
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private CalendarView calendarView;
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Привет Мир!");
                calendarView.setDate(System.currentTimeMillis());
            }
        });
    }

    public  void sayHello(View view){
        textView.setText("Привет!");
    }
}
