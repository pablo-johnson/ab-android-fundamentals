package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class UIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_ui);
        //LinearLayout
        //setContentView(R.layout.layout_linear);

        //RelativeLayout
        //setContentView(R.layout.layout_relative);

        setContentView(R.layout.layout_vine_sign_in);
    }
}
