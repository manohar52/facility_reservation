package com.database;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseHelperA extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "macres.db";
    private static final int DATABASE_VERSION = 1;
    private static DatabaseHelperA sInstance;

    public static DatabaseHelperA getInstance(Context context, int flag) {

        if (sInstance == null) {
            sInstance = new DatabaseHelperA(context.getApplicationContext());
        }
        return sInstance;
    }
    private DatabaseHelperA(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}