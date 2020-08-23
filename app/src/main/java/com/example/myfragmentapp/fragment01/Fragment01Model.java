package com.example.myfragmentapp.fragment01;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myfragmentapp.Fragment02;
import com.example.myfragmentapp.Fragment03;
import com.example.myfragmentapp.MainActivity;
import com.example.myfragmentapp.R;

public class Fragment01Model {

    Activity mActivity;

    public Fragment01Model(Context context){

    }

    public Fragment01Model(Activity activity){
        this.mActivity = activity;
    }

    public void clickNextButton(String[] text, EditText editText, FragmentManager fragmentManager, int ABC){

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.addToBackStack(null);

        text[0] = editText.getText().toString();

        switch (ABC){
            case 1:
                fragmentTransaction.replace(R.id.container, Fragment01.newInstance(text[0], mActivity));
                fragmentTransaction.commit();
                break;

            case 2:
                fragmentTransaction.replace(R.id.container, Fragment02.newInstance(text[0], mActivity));
                fragmentTransaction.commit();
                break;

            case 3:
                fragmentTransaction.replace(R.id.container, Fragment03.newInstance(text[0], mActivity));
                fragmentTransaction.commit();
                break;

        }
        editText.getText().clear();
    }
}
