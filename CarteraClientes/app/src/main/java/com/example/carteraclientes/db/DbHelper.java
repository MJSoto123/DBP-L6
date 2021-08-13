package com.example.carteraclientes.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "DATOS",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("id INTEGER PRIMARY KEY AUTOINCREMENT, ")
        sql.append("NOMBRE TEXT NOT NULL, ");
        sql.append("DIRECCION TEXT NOT NULL, ");
        sql.append("EMAIL TEXT, ");
        sql.append("TELEFONO INTEGER)");

        sqLiteDatabase.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}