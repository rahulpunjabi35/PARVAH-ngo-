package com.kc.parvah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    static DbHandler db;
    EditText etName, etPassword;
    Button btnSubmit, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSignup = findViewById(R.id.btnSignup);
        db = new DbHandler(this);





        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = etName.getText().toString();
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

                 db.login(username,password);

                    startActivity(new Intent(Login.this, Services.class));

            }
        });



        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Signup.class));
            }
        });




    }
}
