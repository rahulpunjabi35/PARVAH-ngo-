package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Services extends AppCompatActivity {

    Button btnChild,btnResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        btnChild = findViewById(R.id.btnChild);
        btnResource = findViewById(R.id.btnResource);

        btnChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Services.this,Child.class));
            }
        });


      /*  btnResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Services.this,Resource.class));
            }
        });*/
    }
}
