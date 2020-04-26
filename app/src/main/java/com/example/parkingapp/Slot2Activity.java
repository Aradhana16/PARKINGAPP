package com.example.parkingapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Slot2Activity extends AppCompatActivity {

    public Button cars1,cars2,bikes1,bikes2;

    private boolean btn1visiblity,btn2visiblity,btn3visiblity,btn4visiblity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot1);
        cars1=(Button)findViewById(R.id.ca1);

        cars2=(Button)findViewById(R.id.ca2);

        bikes1=(Button)findViewById(R.id.bik1);

        bikes2=(Button)findViewById(R.id.bik2);
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn1visiblity = prefs.getBoolean("BTN1visibility", true);
        btn2visiblity = prefs.getBoolean("BTN2visibility", true);
        btn3visiblity = prefs.getBoolean("BTN3visibility", true);
        btn4visiblity = prefs.getBoolean("BTN4visibility", true);
        if(btn1visiblity){
            cars1.setVisibility(View.VISIBLE);
        }else{
            cars1.setVisibility(View.INVISIBLE);
        }
        if(btn2visiblity){
            cars2.setVisibility(View.VISIBLE);
        }else{
            cars2.setVisibility(View.INVISIBLE);
        }
        if(btn3visiblity){
            bikes1.setVisibility(View.VISIBLE);
        }else{
            bikes1.setVisibility(View.INVISIBLE);
        }
        if(btn4visiblity){
            bikes2.setVisibility(View.VISIBLE);
        }else{
            bikes2.setVisibility(View.INVISIBLE);
        }



    }

    public void ca1(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn1visiblity = prefs.getBoolean("BTN1visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN1visibility", false);
        editor.commit();
        cars1.setVisibility(View.INVISIBLE);

        Intent intent = new Intent(Slot2Activity.this, MainActivity.class);

        startActivity(intent);

    }
    public void ca2(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn2visiblity = prefs.getBoolean("BTN2visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN2visibility", false);
        editor.commit();
        cars2.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot2Activity.this, MainActivity.class);

        startActivity(intent);
    }
    public void bik1(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn3visiblity = prefs.getBoolean("BTN3visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN3visibility", false);
        editor.commit();
        bikes1.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot2Activity.this, MainActivity.class);

        startActivity(intent);
    }
    public void bik2(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn4visiblity = prefs.getBoolean("BTN4visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN4visibility", false);
        editor.commit();
        bikes2.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot2Activity.this, MainActivity.class);

        startActivity(intent);
    }

}