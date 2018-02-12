package com.androidbootcamp.androidtemplate;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainGradleActivity extends AppCompatActivity {

    private ImageView  imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gradle);

        imageView  =   findViewById(R.id.imageView);

        //events
        findViewById(R.id.buttonProperties).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProperties();
            }
        });

        findViewById(R.id.buttonCustomTask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImageByAssets();
            }
        });
    }

    private void showImageByAssets() {
        imageView.setImageBitmap(bitmapFromAssets("cat_laptop.png"));
    }

    private void showProperties(){
        String storeFile=BuildConfig.STORE_FILE;
        Toast.makeText(this,"storage File "+ storeFile,Toast.LENGTH_LONG).show();
    }

    private Bitmap bitmapFromAssets(String fileName){

        AssetManager assetManager = getAssets();
        InputStream inputStream = null;
        try{
            inputStream = assetManager.open(fileName);
        }catch(IOException e){
            e.printStackTrace();
        }

        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        return bitmap;
    }
}
