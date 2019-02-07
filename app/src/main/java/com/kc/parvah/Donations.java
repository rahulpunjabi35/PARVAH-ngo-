package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Donations extends AppCompatActivity {

    Button btnDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        btnDonors = findViewById(R.id.btnDonors);

        GraphView graph = (GraphView) findViewById(R.id.graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(2015, 10),
                new DataPoint(2016, 40),
                new DataPoint(2017, 20),
                new DataPoint(2018, 30),
                new DataPoint(2019, 60)
        });
        //graph.getViewport().setScalableY(true);
        graph.addSeries(series);


        btnDonors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Donations.this, Donors.class));
            }
        });

    }



}
