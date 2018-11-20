package com.mgumbs.diplomado.layoutsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doSelectLayout(View view){
        Toast.makeText(this, "Layout Select Comming!!!",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, Select_Layout_Activity.class);
        startActivity(aIntent);

    }
}
