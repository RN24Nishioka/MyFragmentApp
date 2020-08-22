package com.example.myfragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment02 extends Fragment {

    private String text;



    public static Fragment02 newInstance(String text) {
        Fragment02 fragment = new Fragment02();
        Bundle args = new Bundle();
        args.putString("Bは", text);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_02, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();

        if(args != null){
            String text = args.getString("Bは");
            String str = "Bは: "+ text;

            TextView textView = view.findViewById(R.id.textA);
            textView.setText(str);
        }

        Button buttonNext = view.findViewById(R.id.buttonNext);
//        buttonNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getFragmentManager();
//                if(fragmentManager != null){
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                    fragmentTransaction.addToBackStack(null);
//                    text[0] = editText.getText().toString();
//
//                    fragmentTransaction.replace(R.id.container, Fragment02.newInstance(text[0]));
//                    fragmentTransaction.commit();
//
//                    editText.getText().clear();
//                }
//            }
//        });

        Button pop01 = view.findViewById(R.id.pop_01);
        pop01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                if(fragmentManager != null){
                    fragmentManager.popBackStack();
                }
            }
        });
    }
}