package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    private String message="empty!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        extras();
        ui();
    }

    private void ui() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void extras() {
        if(getIntent()!=null && getIntent().getExtras()!=null){
            message= getIntent().getExtras().getString("MESSAGE");
        }
    }

    //habilita la acción de back
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    //para mostrar el mensaje en el TextView
    /**
     private void showMessage(String string){
        textView.setText(R.string);
     }
     */


}
