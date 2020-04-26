package com.example.parkingapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Slot1Activity extends AppCompatActivity {

   public static Button ca1,ca2,bik1,bik2;

   private boolean btn1visiblity,btn2visiblity,btn3visiblity,btn4visiblity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot1);
        ca1=(Button)findViewById(R.id.car1);

        ca2=(Button)findViewById(R.id.car2);

        bik1=(Button)findViewById(R.id.bike1);

        bik2=(Button)findViewById(R.id.bike2);
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn1visiblity = prefs.getBoolean("BTN1visibility", true);
        btn2visiblity = prefs.getBoolean("BTN2visibility", true);
        btn3visiblity = prefs.getBoolean("BTN3visibility", true);
        btn4visiblity = prefs.getBoolean("BTN4visibility", true);
        if(btn1visiblity){
            ca1.setVisibility(View.VISIBLE);
        }else{
            ca1.setVisibility(View.INVISIBLE);
        }
        if(btn2visiblity){
            ca2.setVisibility(View.VISIBLE);
        }else{
            ca2.setVisibility(View.INVISIBLE);
        }
        if(btn3visiblity){
            bik1.setVisibility(View.VISIBLE);
        }else{
            bik1.setVisibility(View.INVISIBLE);
        }
        if(btn4visiblity){
            bik2.setVisibility(View.VISIBLE);
        }else{
            bik2.setVisibility(View.INVISIBLE);
        }



    }

    public void car1(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn1visiblity = prefs.getBoolean("BTN1visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN1visibility", false);
        editor.commit();
        ca1.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot1Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void car2(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn2visiblity = prefs.getBoolean("BTN2visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN2visibility", false);
        editor.commit();
        ca2.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot1Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void bike1(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn3visiblity = prefs.getBoolean("BTN3visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN3visibility", false);
        editor.commit();
        bik1.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot1Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void bike2(View view)
    {
        final SharedPreferences prefs = getSharedPreferences("sharedPreferences", MODE_PRIVATE);
        btn4visiblity = prefs.getBoolean("BTN4visibility", true);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("BTN4visibility", false);
        editor.commit();
        bik2.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(Slot1Activity.this, MainActivity.class);
        startActivity(intent);
    }

}
