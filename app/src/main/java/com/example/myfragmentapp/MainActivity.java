package com.example.myfragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        Button buttonA = findViewById(R.id.buttonA);

        final String[] text = new String[1];

        if(savedInstanceState == null){

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





        }
    }
}