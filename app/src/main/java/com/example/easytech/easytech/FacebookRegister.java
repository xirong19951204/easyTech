package com.example.easytech.easytech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FacebookRegister extends AppCompatActivity {

    private static ImageView fbreg1;
    private static Button next, last;

    private int current_image_index;
    int[] imagefbreg = {R.drawable.fbreg1, R.drawable.fbreg2,R.drawable.fbreg3,R.drawable.fbreg4,R.drawable.fbreg5,R.drawable.fbreg6,R.drawable.fbreg7,R.drawable.fbreg8,R.drawable.fbreg9,R.drawable.fbreg10,R.drawable.fbreg11,R.drawable.fbreg12,R.drawable.fbreg13};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_register);
        Clicknext();
    }

    public void Clicknext(){
        fbreg1 = (ImageView)findViewById(R.id.imageView_fb1);
        next = (Button)findViewById(R.id.button_next);
        last = (Button)findViewById(R.id.button_last);
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    current_image_index++;
                        current_image_index = current_image_index % imagefbreg.length;
                        fbreg1.setImageResource(imagefbreg[current_image_index]);
                    }
                }
        );
        last.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index--;
                        current_image_index = current_image_index % imagefbreg.length;
                        fbreg1.setImageResource(imagefbreg[current_image_index]);
                    }
                }
        );
    }


    public void home(View v) {
        Intent gotoHome = new Intent();
        gotoHome.setClass(this, MainActivity.class);
        startActivity(gotoHome);
    }
}
