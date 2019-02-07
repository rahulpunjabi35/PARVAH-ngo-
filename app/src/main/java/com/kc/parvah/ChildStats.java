package com.kc.parvah;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class ChildStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_stats);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.getViewport().setScrollable(true);


        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(2);

// set manual Y bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-5);
        graph.getViewport().setMaxY(100);
        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(1, 80),
                new DataPoint(2, 75),
                new DataPoint(3, 85),
                new DataPoint(4, 72),
                new DataPoint(5, 66),
                new DataPoint(6, 56),
                new DataPoint(7, 73),
                new DataPoint(8, 90),
                new DataPoint(9, 87),
                new DataPoint(10, 78)        });
        graph.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.POINT);
        series.setColor(Color.GREEN);

        PointsGraphSeries<DataPoint> series2 = new PointsGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(1, 75.04),
                new DataPoint(2, 70.06),
                new DataPoint(3, 82),
                new DataPoint(4, 72.5),
                new DataPoint(5, 65),
                new DataPoint(6, 60.02),
                new DataPoint(7, 69.69),
                new DataPoint(8, 85.66),
                new DataPoint(9, 79.98),
                new DataPoint(10, 77.02)
        });
        graph.addSeries(series2);
        series2.setShape(PointsGraphSeries.Shape.RECTANGLE);
        series2.setColor(Color.RED);

        PointsGraphSeries<DataPoint> series3 = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(1, 5),
                new DataPoint(2, -5),
                new DataPoint(3, 5),
                new DataPoint(4, 5),
                new DataPoint(5, -5),
                new DataPoint(6, 5),
                new DataPoint(7, -5),
                new DataPoint(8, 5),
                new DataPoint(9, 5),
                new DataPoint(10, 5)
        });
        graph.addSeries(series3);
        series3.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series3.setColor(Color.BLUE);
/*
        PointsGraphSeries<DataPoint> series4 = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 2),
                new DataPoint(2, 0),
                new DataPoint(3, -1),
                new DataPoint(4, 3)
        });
        graph.addSeries(series4);
        series4.setColor(Color.GREEN);
        series4.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(10);
                canvas.drawLine(x-20, y-20, x+20, y+20, paint);
                canvas.drawLine(x+20, y-20, x-20, y+20, paint);
            }
        });
*/
    }
}
