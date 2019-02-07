package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VerifyActivity extends AppCompatActivity {


    EditText etName;
    EditText etPassword;
    TextView tvData;
    Button btnVerify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);


        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        tvData = findViewById(R.id.tvData);
        btnVerify = findViewById(R.id.btnVerify);


        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String password = etPassword.getText().toString();

                if (etName.length() == 0) {
                    etName.setError("Name is empty");
                    etName.setText("");
                    etName.requestFocus();
                }
                if (etPassword.length() == 0) {
                    etPassword.setError("Password is empty");
                    etPassword.setText("");
                    etPassword.requestFocus();
                }

                if(name.equals("admin") && password.equals("admin")) {
                    startActivity(new Intent(VerifyActivity.this, Home.class));
                    finish();

                }
               // db.verify(name, password);
                else {
                    Toast.makeText(VerifyActivity.this, "incorrect password", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
