package com.kc.parvah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    EditText etFname, etLname, etPassword, etUsername;
    Button btnSignup;
    static DbHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etFname = findViewById(R.id.etFname);
        etLname = findViewById(R.id.etLname);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);
        db = new DbHandler(this);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fname = etFname.getText().toString();
                String lname = etLname.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (etLname.length() == 0) {
                    etLname.setError("Name is empty");
                    etLname.setText("");
                    etLname.requestFocus();
                }
                if (etPassword.length() == 0) {
                    etPassword.setError("Password is empty");
                    etPassword.setText("");
                    etPassword.requestFocus();
                }
                if (etFname.length() == 0) {
                    etFname.setError("Name is empty");
                    etFname.setText("");
                    etFname.requestFocus();
                }
                if (etUsername.length() == 0) {
                    etUsername.setError("Password is empty");
                    etUsername.setText("");
                    etUsername.requestFocus();
                }

                db.signup(fname, lname, username, password);

            }
        });
    }
}
