package com.example.practice;

import static com.example.practice.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

    }

    public void change(View v){
        TextView textView = (TextView) findViewById(id.text);
        textView.setText("I'm so full");


        LinearLayout mLinearLayout = (LinearLayout) findViewById(R.id.linear);
        mLinearLayout.setBackgroundResource(drawable.img_1);

    }



}