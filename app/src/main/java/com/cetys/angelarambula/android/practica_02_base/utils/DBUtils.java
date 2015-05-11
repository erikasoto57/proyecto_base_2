package com.cetys.angelarambula.android.practica_02_base.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.cetys.angelarambula.android.practica_02_base.model.Coach;

/**
 * Created by AngelArambula on 4/13/15.
 */
public class DBUtils extends SQLiteOpenHelper {

    public static final String C_COACHES = "Coaches";
    public static final String C_COACH_ID = "_id";
    public static final String C_COACH_NAME = "_name";
    public static final String C_COACH_TEAM = "_team";
    //Escribir query para crear la tabla de coaches
    private static final String CREATE_TABLE_COACHES_QUERY = "";
    private static final String DATABASE_NAME = "Coaches.db";
    private static final int DATABASE_VERSION = 2;
    public Coach test = new Coach();

    public DBUtils(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_COACHES_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + C_COACHES);
        onCreate(db);
    }
}