package com.example.easytech.easytech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TwitterMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_main);
    }
    public void twi1(View v){
        Intent gotoFB = new Intent();
        gotoFB.setClass(this, FacebookMain.class);
        startActivity(gotoFB);
    }
    public void twi2(View v){
        Intent gotoFB = new Intent();
        gotoFB.setClass(this, FacebookMain.class);
        startActivity(gotoFB);
    }
    public void twi3(View v){
        Intent gotoFB = new Intent();
        gotoFB.setClass(this, FacebookMain.class);
        startActivity(gotoFB);
    }
    public void home(View v) {
        Intent gotoHome = new Intent();
        gotoHome.setClass(this, MainActivity.class);
        startActivity(gotoHome);
    }
}
