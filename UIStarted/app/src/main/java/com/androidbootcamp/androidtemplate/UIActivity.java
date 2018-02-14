package com.androidbootcamp.androidtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        //LinearLayout
        //setContentView(R.layout.layout_linear);

        //RelativeLayout
        //setContentView(R.layout.layout_relative);
    }
}
