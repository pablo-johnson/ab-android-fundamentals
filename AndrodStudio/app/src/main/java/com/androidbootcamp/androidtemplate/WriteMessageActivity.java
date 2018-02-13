package com.androidbootcamp.androidtemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteMessageActivity extends AppCompatActivity {

    private EditText editText2;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_message);
        editText2= findViewById(R.id.editText2);
        button4= findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message= editText2.getText().toString().trim();
                goToBundleMessageActivity(message);
            }
        });
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
