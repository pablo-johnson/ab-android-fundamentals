package com.androidbootcamp.androidtemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WriteMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_message);
        //goToMessageActivity();
    }

    private void goToMessageActivity(){

        Intent intent= new Intent(this,MessageActivity.class);
        startActivity(intent);
    }

    private void goToBundleMessageActivity(String message){

        Bundle bundle= new Bundle();
        bundle.putString("MESSAGE",message);
        Intent intent= new Intent(this,MessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void goToMessageActivity(String message){
        
        Intent intent= new Intent(this,MessageActivity.class);
        intent.putExtra("MESSAGE",message);
        startActivity(intent);
    }
}
