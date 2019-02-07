package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewChild extends AppCompatActivity {

    TextView tvChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_child);

        tvChild = findViewById(R.id.tvChild);
        tvChild.setMovementMethod(new ScrollingMovementMethod());


        Intent a = getIntent();


        String fn = "child.txt";
        String line = "";
        StringBuffer sb = new StringBuffer();

        try {
            InputStreamReader isr = new InputStreamReader(getAssets().open(fn));
            BufferedReader br = new BufferedReader(isr);

            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            tvChild.setText(sb.toString());
            FileWriter arc = new FileWriter("child.txt");
            arc.write(String.format("%20s %20s %20s","name","current_std","current percentage","avg percentile","process"));
            arc.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
