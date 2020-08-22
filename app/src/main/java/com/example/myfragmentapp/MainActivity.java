package com.example.myfragmentapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment01 mFragment01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        //MainActivityのeditTextを入手
        Fragment01 fragment01 = new Fragment01(this);
        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);
        Button buttonC = findViewById(R.id.buttonC);




        final String[] text = new String[1];

        if (savedInstanceState == null) {

            buttonA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                    fragmentTransaction.addToBackStack(null);

                    text[0] = editText.getText().toString();

                    fragmentTransaction.replace(R.id.container, Fragment01.newInstance(text[0]));
                    fragmentTransaction.commit();

                    editText.getText().clear();
                }
            });

            buttonB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager2 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();

                    fragmentTransaction2.addToBackStack(null);

                    text[0] = editText.getText().toString();


                    fragmentTransaction2.replace(R.id.container, Fragment02.newInstance(text[0]));
                    fragmentTransaction2.commit();

                    editText.getText().clear();
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager3 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();

                    fragmentTransaction3.addToBackStack(null);

                    text[0] = editText.getText().toString();


                    fragmentTransaction3.replace(R.id.container, Fragment03.newInstance(text[0]));
                    fragmentTransaction3.commit();

                    editText.getText().clear();
                }
            });



        }
    }
}