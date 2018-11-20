package com.mgumbs.diplomado.layoutsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Select_Layout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__layout);
    }

    public void doLinear(View view){
        Toast.makeText(this, "Linear Layout Selected",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, Linear.class);
        startActivity(aIntent);
    }

    public void doLinearH(View view){
        Toast.makeText(this, "Horizontal Linear Layout Selected",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, LHorizontal.class);
        startActivity(aIntent);
    }

    public void doRelative(View view){
        Toast.makeText(this, "Relaive Layout Selected",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, Relative_Activity.class);
        startActivity(aIntent);
    }

    public void doListView(View view){
        Toast.makeText(this, "ListView Layout Selected",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, List_Activity.class);
        startActivity(aIntent);
    }

    public void doGrid(View view){
        Toast.makeText(this, "Grid Layout Selected",
                Toast.LENGTH_LONG).show();

        Intent aIntent = new Intent(this, Grid_Activity.class);
        startActivity(aIntent);
    }

    public void doTable(View view){
        Toast.makeText(this, "Comming Soon!!",
                Toast.LENGTH_LONG).show();
    }
}
