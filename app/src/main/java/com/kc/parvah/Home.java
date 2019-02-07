package com.kc.parvah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView tvAboutus, tvDonation, tvFeedback, tvWecare, tvParvah;
    ImageButton ibAboutUs, ibDonation, ibFeedback,ibLogin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvAboutus = findViewById(R.id.tvAboutus);
        tvDonation = findViewById(R.id.tvDonation);
        tvFeedback = findViewById(R.id.tvFeedback);
        tvWecare = findViewById(R.id.tvWeCare);
        tvParvah = findViewById(R.id.tvParvah);
        ibAboutUs = findViewById(R.id.ibAboutUs);
        ibDonation = findViewById(R.id.ibDonation);
        ibFeedback = findViewById(R.id.ibFeedback);
        ibLogin1 = findViewById(R.id.ibLogin1);

        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Home.this,AboutUs.class);
                startActivity(ab);
            }
        });

        ibFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent f = new Intent(Home.this,FeedBack.class);
                startActivity(f);
            }
        });



        ibDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Donations.class));
            }
        });

        ibLogin1
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Login.class));
            }
        });



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Do you really want to exit??");
        builder.setCancelable(false);

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setNeutralButton("FEEDBACK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent a = new Intent(Home.this,FeedBack.class);
                startActivity(a);
            }
        });

        AlertDialog alert = builder.create();
        alert.setTitle("Exit");
        alert.show();
    }
}
