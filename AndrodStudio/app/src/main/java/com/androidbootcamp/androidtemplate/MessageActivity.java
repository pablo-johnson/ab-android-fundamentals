package com.androidbootcamp.androidtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MessageActivity extends AppCompatActivity {

    private String message="empty!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        extras();
    }

    private void extras() {
        if(getIntent()!=null && getIntent().getExtras()!=null){
            message= getIntent().getExtras().getString("MESSAGE");
        }
    }
}
