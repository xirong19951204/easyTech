package com.example.easytech.easytech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FacebookMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_main);
    }
    public void fb1(View v){
        Intent gotoFB1 = new Intent();
        gotoFB1.setClass(this, FacebookMain.class);
        startActivity(gotoFB1);
    }
    public void fb2(View v){
        Intent gotoFB2 = new Intent();
        gotoFB2.setClass(this, FacebookRegister.class);
        startActivity(gotoFB2);
    }
    public void fb3(View v){
        Intent gotoFB = new Intent();
        gotoFB.setClass(this, FacebookMain.class);
        startActivity(gotoFB);
    }
    public void fb4(View v){
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

