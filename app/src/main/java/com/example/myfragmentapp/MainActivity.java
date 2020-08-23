package com.example.myfragmentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myfragmentapp.fragment01.Fragment01;
import com.example.myfragmentapp.fragment01.Fragment01Model;

public class MainActivity extends AppCompatActivity {

    public static final String STATE_MODEL = "STATE_MODEL";
    private Fragment01Model mModel = new Fragment01Model(this);
    //MainActivityのeditTextを入手
    Fragment01 fragment01 = new Fragment01(this);
    Fragment02 fragment02 = new Fragment02(this);
    Fragment02 fragment03 = new Fragment02(this);
    int ABC;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MVCに書き換え中");

        final EditText editText = findViewById(R.id.editText);
        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);
        Button buttonC = findViewById(R.id.buttonC);


        final String[] text;
        text = new String[1];

        if (savedInstanceState == null) {

            buttonA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    mModel.clickNextButton(text, editText, fragmentManager, 1);

                }
            });

            buttonB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    mModel.clickNextButton(text, editText, fragmentManager, 2);

                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    mModel.clickNextButton(text, editText, fragmentManager, 3);

                }
            });



        }
    }
}