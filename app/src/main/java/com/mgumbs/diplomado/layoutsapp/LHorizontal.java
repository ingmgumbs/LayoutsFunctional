package com.mgumbs.diplomado.layoutsapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class LHorizontal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhorizontal);
    }

    public void doRed(View view){
        View mainview = this.getWindow().getDecorView();
        mainview.setBackgroundColor(Color.RED);;
    }

    public void doGreen(View view){
        View mainview = this.getWindow().getDecorView();
        mainview.setBackgroundColor(Color.GREEN);;
    }

    public void doBlue(View view){
        View mainview = this.getWindow().getDecorView();
        mainview.setBackgroundColor(Color.BLUE);;
    }

    public void doWhite(View view){
        View mainview = this.getWindow().getDecorView();
        mainview.setBackgroundColor(Color.WHITE);;
    }

}
