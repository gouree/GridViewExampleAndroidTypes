package com.example.gouree.gridviewexampleandroidtypes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //grid view object
    GridView grid_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting adapter
        grid_view =(GridView)findViewById(R.id.gridview);
        grid_view.setAdapter(new ImageAdapter(this));

        //on click of item in grid display a toast
        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "You clicked on image"+position, Toast.LENGTH_LONG).show();
            }
        });
    }
}
