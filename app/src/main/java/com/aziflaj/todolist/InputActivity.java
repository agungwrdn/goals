package com.aziflaj.todolist;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by RAW-ON on 22/11/2016.
 */

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void onStart(){
        super.onStart();
        EditText txtDate=(EditText) findViewById(R.id.editTextDate);
        txtDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus){
                    DateDialog dialog = new DateDialog(view);
                    android.app.FragmentTransaction ft= getFragmentManager().beginTransaction();
                    dialog.show(ft, "DatePicker");

                }
            }
        });
        EditText txtTime = (EditText) findViewById(R.id.editTexttime);
        txtTime.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    TimeDialog dialog = new TimeDialog(view);
                    android.app.FragmentTransaction ft= getFragmentManager().beginTransaction();
                    dialog.show(ft, "TimePicker");

                }
            }
        });
    }




}
