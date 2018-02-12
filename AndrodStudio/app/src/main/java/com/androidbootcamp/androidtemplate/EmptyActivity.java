package com.androidbootcamp.androidtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
    }

    /*
       private TextView textView;
       textView= findViewById(R.id.textView);
     */
    /*
       textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(USER_MESSAGE);
            }
        });
     */

    /*
    private void showMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.v("CONSOLE",message);
    }
     */
}
