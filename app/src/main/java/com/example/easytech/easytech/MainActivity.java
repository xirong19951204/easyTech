package com.example.easytech.easytech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fb(View v){
        Intent gotoFB = new Intent();
        gotoFB.setClass(this, FacebookMain.class);
        startActivity(gotoFB);
    }
    public void twi(View v){
        Intent gototwi = new Intent();
        gototwi.setClass(this, TwitterMain.class);
        startActivity(gototwi);
    }
    public void ins(View v){
        Intent gotoins = new Intent();
        gotoins.setClass(this, InstagramMain.class);
        startActivity(gotoins);
    }
    public void home(View v) {
        Intent gotoHome = new Intent();
        gotoHome.setClass(this, MainActivity.class);
        startActivity(gotoHome);
    }
}
