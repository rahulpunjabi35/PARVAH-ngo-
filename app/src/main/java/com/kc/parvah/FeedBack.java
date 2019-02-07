package com.kc.parvah;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toolbar;

public class FeedBack extends AppCompatActivity {


    TextView tvFeed,tvRate;
    EditText etFeed;
    RatingBar rab;
    ImageButton ib1;

    String rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        tvFeed = findViewById(R.id.tvFeed);
        tvRate = findViewById(R.id.tvRate);
        etFeed = findViewById(R.id.etFeed);
        ib1 = findViewById(R.id.ib1);
        rab = findViewById(R.id.rb);


        final String feed = etFeed.getText().toString();

        rating = String.valueOf(rab.getRating());


        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg =  "Feedback:"+etFeed.getText().toString()+ " \nRating: " + rating;

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"+"sahiltotani33@gmail.com"));
                i.putExtra(Intent.EXTRA_TEXT,msg);
                startActivity(i);

            }
        });
    }



}

