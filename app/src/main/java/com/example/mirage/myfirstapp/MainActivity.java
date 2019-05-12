package com.example.mirage.myfirstapp;
/*
* @autor Yo
* @version 03.05.2019
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private CalendarView calendarView;
private Button button;
private Button button2;
    private String pattern = "MM/dd/yyyy HH:mm:ss";
    private DateFormat dateFormat = new SimpleDateFormat(pattern);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        //DateFormat dateFormat = new SimpleDateFormat(pattern);
/*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this,
                //Intent intent = new Intent(this, SecondActivity,class);
                //startActivity(intent);
                textView.setText("Привет Мир");
            }
        });
*/

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

 //   public  void goToSecondActivity(View view){
 //       textView.setText("Привет!");

 //   }
    public void goToSecondActivity (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        //intent.addFlags(intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra("time", dateFormat.format(calendarView.getDate()).toString());
        startActivity(intent);
        textView.setText("Привет!!!");


    }

    public void onShowToast (View view) {
        //Toast toast = new Toast(this);
        //toast.makeText(getApplicationContext(),"Привет",Toast.LENGTH_LONG);
        Toast toast = Toast.makeText(this,"Привет",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }


    public void onPositoin (View view){
        Context applicationContext = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(applicationContext,"ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show();
        }
        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(applicationContext,"ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show();
        }


    }





}

