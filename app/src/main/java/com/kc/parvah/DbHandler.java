package com.kc.parvah;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;
import static android.support.v4.content.ContextCompat.startActivity;

public class DbHandler extends SQLiteOpenHelper {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Context context;

    DbHandler(Context context) {
        super(context, "parvah", null, 1);
        this.context = context;
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table users (fname text primary key, lname text,username text, password text)";

        db.execSQL(sql);
    }

    public void signup(String fname, String lname, String username, String password) {
        ContentValues cv = new ContentValues();
        cv.put("fname", fname);
        cv.put("lname", lname);
        cv.put("username", username);
        cv.put("password", password);
        long rid = db.insert("users", null, cv);

        if (rid < 0)
            Toast.makeText(context, "insert issue", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(context, "insert", Toast.LENGTH_SHORT).show();
    }

    public void login(String username, String password) {
        ContentValues cv = new ContentValues();
        SQLiteDatabase db = this.getWritableDatabase();
        String[] userNames = new String[1];
        userNames[0] = username;
        Cursor cursor = db.query("users", new String[]{"username","password"}, "password=?",userNames,null,null,null);
        int db_username_id = cursor.getColumnIndex("username");
        int db_password_id = cursor.getColumnIndex("password");


      //  Toast.makeText(context, new StringBuilder(cursor.getString())+"", Toast.LENGTH_SHORT).show();

        cursor.moveToFirst();
        if(cursor != null && (cursor.getCount() > 0)){
            do {
                String db_username = cursor.getString(db_username_id);
                String db_password = cursor.getString(db_password_id);
                if(password.equals(db_password)){
                    Toast.makeText(context, "PASSWORD = " + db_password + " NAME = " + db_username, Toast.LENGTH_SHORT).show();
                    break;

                }
            } while (cursor.moveToNext());
        }


    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }





}
