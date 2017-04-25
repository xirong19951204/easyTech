package com.example.easytech.easytech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FacebookRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_register);
    }
    public void next(View v){
        Intent gotonext = new Intent();
        gotonext.setClass(this, FacebookRegister.class);
        startActivity(gotonext);
    }
    public void last(View v){
        Intent gotolast = new Intent();
        gotolast.setClass(this, FacebookRegister.class);
        startActivity(gotolast);
    }

    public void home(View v) {
        Intent gotoHome = new Intent();
        gotoHome.setClass(this, MainActivity.class);
        startActivity(gotoHome);
    }
}
