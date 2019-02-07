package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Child extends AppCompatActivity {


    Button btnView,btnStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        btnView = findViewById(R.id.btnView);
        btnStats = findViewById(R.id.btnStats);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Child.this,ViewChild.class));
            }
        });



        btnStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Child.this,ChildStats.class));
            }
        });


    }
}
