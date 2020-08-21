package com.example.myfragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment01 extends Fragment {

    private String text;


    public static Fragment01 newInstance(String text) {
        Fragment01 fragment = new Fragment01();
        Bundle args = new Bundle();
        args.putString("Aは", text);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_01, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();

        if(args != null){
            String text = args.getString("Aは");
            String str = "Aは: "+ text;

            TextView textView = view.findViewById(R.id.textA);
            textView.setText(str);
        }

//        Button buttonBack = view.findViewById(R.id.buttonNext);
//        buttonBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getFragmentManager();
//                if(fragmentManager != null){
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                    fragmentTransaction.addToBackStack(null);
//
//                    fragmentTransaction.replace(R.id.container, Fragment02.newInstance(cnt));
//                    fragmentTransaction.commit();
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