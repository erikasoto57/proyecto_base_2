package com.cetys.angelarambula.android.practica_02_base.view;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.cetys.angelarambula.android.practica_01_base.R;


public class GreetingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }
}
